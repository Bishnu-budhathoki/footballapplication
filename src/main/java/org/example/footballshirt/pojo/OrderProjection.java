package org.example.footballshirt.pojo;

public interface OrderProjection {
    Integer getId();

    String getOrderId();

    String getDate();

    String  getProductId();

    Integer getQuantity();

    Double getTotalPrice();


}
