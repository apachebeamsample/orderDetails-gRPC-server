package server;



import com.order.generated.stubs.ProductDetails;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductList {

    public static List<ProductDetails> getProducts(List<String> productIdList) {
        Map<String , ProductDetails> productMap= new HashMap<>();
        ProductDetails product1= ProductDetails.newBuilder().setProductId("P0001").setProductName("Pixel 4a").setPrice(400).build();
        ProductDetails product2= ProductDetails.newBuilder().setProductId("P0002").setProductName("Google Mini").setPrice(200).build();
        ProductDetails product3= ProductDetails.newBuilder().setProductId("P0003").setProductName("Pixel 4").setPrice(700).build();
        ProductDetails product4= ProductDetails.newBuilder().setProductId("P0004").setProductName("Google Home").setPrice(500).build();
        ProductDetails product5= ProductDetails.newBuilder().setProductId("P0005").setProductName("Chromecast").setPrice(100).build();
        ProductDetails product6= ProductDetails.newBuilder().setProductId("P0006").setProductName("Pixel stand").setPrice(80).build();
        ProductDetails product7= ProductDetails.newBuilder().setProductId("P0007").setProductName("Google Nest Hub").setPrice(300).build();

        productMap.put("P0001",product1);
        productMap.put("P0002",product2);
        productMap.put("P0003",product3);
        productMap.put("P0004",product4);
        productMap.put("P0005",product5);
        productMap.put("P0006",product6);
        productMap.put("P0007",product7);

        List<ProductDetails> productsList= new ArrayList<>();
                productIdList.forEach( prodId->{
                    ProductDetails prod ;
                    if(null != productMap.get(prodId)) {
                        prod = productMap.get(prodId);
                        productsList.add(prod);
                    }
                });
        return productsList;
    }
}
