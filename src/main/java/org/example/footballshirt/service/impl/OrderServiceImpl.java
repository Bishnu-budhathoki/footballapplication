package org.example.footballshirt.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.footballshirt.entity.Order;
import org.example.footballshirt.pojo.OrderPojo;
import org.example.footballshirt.repository.OrderRepository;
import org.example.footballshirt.service.OrderService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;

    @Override
    public Integer saveOrder(OrderPojo orderPojo) {
        Order order = new Order();
        order.setUserId(orderPojo.getOrder_id());
        order.setDate(orderPojo.getDate());
        order.setTotalPrice(order.getTotalPrice());
        orderRepository.save(order);
        return order.getOrder_id();
    }

    @Override
    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    @Override
    public Order findById(Integer id) {
        return orderRepository.findById(id).orElse(null);
    }


    @Override
    public void deleteById(Integer id) {
        orderRepository.deleteById(id);

    }
}
