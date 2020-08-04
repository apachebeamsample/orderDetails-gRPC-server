package server;

import java.util.*;
import java.util.stream.Collectors;

public class OrderMappings {

    public static List<String> getProductList(List<String> orderIdList){

        Map<String, List<String>> orderProductMap=new HashMap<>();

        orderProductMap.put("ODR001", Arrays.asList("P0001","P0004"));
        orderProductMap.put("ODR002", Arrays.asList("P0003","P0004","P0006"));
        orderProductMap.put("ODR003", Arrays.asList("P0001","P0004","P0005","P0006"));
        orderProductMap.put("ODR004", Arrays.asList("P0001"));
        orderProductMap.put("ODR005", Arrays.asList("P0001","P0004","P0007"));


         List<String> productList= new ArrayList<>();

        /*if(null != orderProductMap.get(orderId)){
           productList=orderProductMap.get(orderId);
        }*/
        orderIdList.forEach( orderId->{
          //  List<String> prodList = null;
            productList.addAll(orderProductMap.get(orderId));

            //getFlatList(productList,prodList);
           /* Products prod ;
            if(null != productMap.get(prodId)) {
                prod = productMap.get(prodId);
                productsList.add(prod);
            }*/
        });

        return productList;
    }

    private static void getFlatList(List<String> productList, List<List<String>> prodList) {

        List<String> pList = prodList.stream()
                .flatMap(l -> l.stream())
                .collect(Collectors.toList());

        productList.addAll(pList);
    }




}
