package server;



import com.order.generated.stubs.Address;
import com.order.generated.stubs.UserDetails;

import java.util.*;

public class UserList {

    public static UserDetails getUserInfo(String acctId) {

    UserDetails user1 = UserDetails.newBuilder().setAccountId("AC001").setUserName("user001").addOrderIds("ODR001").addOrderIds("ODR005").addAddress(Address.newBuilder().setAddressType("Billing Address").setHouseNumber("HN-001").setPhone(234567).build()).addAddress(Address.newBuilder().setAddressType("Delivery Address").setHouseNumber("HNDL-001").setPhone(234567).build()).build();
    UserDetails user2 = UserDetails.newBuilder().setAccountId("AC002").setUserName("user002").addOrderIds("ODR002").addAddress(Address.newBuilder().setAddressType("Billing Address").setHouseNumber("HN-002").setPhone(234567).build()).addAddress(Address.newBuilder().setAddressType("Delivery Address").setHouseNumber("HNDL-002").setPhone(234567).build()).build();
    UserDetails user3 = UserDetails.newBuilder().setAccountId("AC003").setUserName("user003").addOrderIds("ODR003").addAddress(Address.newBuilder().setAddressType("Billing Address").setHouseNumber("HN-003").setPhone(234567).build()).addAddress(Address.newBuilder().setAddressType("Delivery Address").setHouseNumber("HNDL-003").setPhone(234567).build()).build();
    UserDetails user4 = UserDetails.newBuilder().setAccountId("AC004").setUserName("user004").addOrderIds("ODR004").addAddress(Address.newBuilder().setAddressType("Billing Address").setHouseNumber("HN-004").setPhone(234567).build()).addAddress(Address.newBuilder().setAddressType("Delivery Address").setHouseNumber("HNDL-004").setPhone(234567).build()).build();
    //UserDetails user5 = UserDetails.newBuilder().setAccountId("AC005").setUserName("user005").addOrderIds("ODR001").addAddress(Address.newBuilder().setAddressType("Billing Address").setHouseNumber("HN-001").setPhone(234567).build()).addAddress(Address.newBuilder().setAddressType("Delivery Address").setHouseNumber("HNDL-001").setPhone(234567).build()).build();Map<String, UserDetails> userMap = new HashMap<>();

    Map<String, UserDetails> userMap = new HashMap<>();
    userMap.put("AC001",user1);
    userMap.put("AC002",user2);
    userMap.put("AC003",user3);
    userMap.put("AC004",user4);
        //userMap.put("AC005",user5);

    UserDetails user= UserDetails.newBuilder().build();
    if (null != userMap.get(acctId))
    user= userMap.get(acctId);

    return user;
    }
}
