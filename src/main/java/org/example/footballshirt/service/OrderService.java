package org.example.footballshirt.service;

import org.example.footballshirt.entity.Order;
import org.example.footballshirt.pojo.OrderPojo;

import java.util.List;

public interface OrderService {

    Integer
    saveOrder(OrderPojo orderPojo);

    List<Order>findAll();

    Order findById(Integer id);

    void deleteById(Integer id);

}
