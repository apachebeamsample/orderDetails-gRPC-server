package server;

import com.order.generated.stubs.*;
import com.order.generated.stubs.UserDetails;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.List;

public class OrderServiceImpl extends OrderServiceGrpc.OrderServiceImplBase {

    @Override
    public void getOrderDetailsByDateRange(OrdersByDateRangeRequest request, StreamObserver<OrdersByDateRangeResponse> responseObserver) {
        super.getOrderDetailsByDateRange(request, responseObserver);
    }

    @Override
    public void getUserPurchaseHistory(UserPurchaseHistoryRequest request, StreamObserver<UserPurchaseHistoryResponse> responseObserver) {
        System.out.println("Request received for getting the purchase details og account:"+request.getAccountId());
        UserDetails user= UserList.getUserInfo(request.getAccountId());
        List<String> prodList= OrderMappings.getProductList(user.getOrderIdsList());
        List<ProductDetails> products= ProductList.getProducts(prodList);

        UserPurchaseHistory uph= UserPurchaseHistory.newBuilder().setUser(UserDetails.newBuilder(user)).addAllProducts(products).build();

        UserPurchaseHistoryResponse uphr=UserPurchaseHistoryResponse.newBuilder().addUserPurcHist(uph).build();
        responseObserver.onNext(uphr);
        responseObserver.onCompleted();
        System.out.println("Response sent successfully");
    }

}
