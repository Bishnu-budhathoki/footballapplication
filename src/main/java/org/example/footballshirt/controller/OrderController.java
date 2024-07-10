package org.example.footballshirt.controller;


import lombok.RequiredArgsConstructor;
import org.example.footballshirt.entity.Order;
import org.example.footballshirt.pojo.OrderPojo;
import org.example.footballshirt.service.OrderService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("order")
public class OrderController {
    private final OrderService orderService;

    @PostMapping
    public void saveData(@RequestBody OrderPojo orderPojo) {
        orderService.saveOrder(orderPojo);
    }
    @GetMapping
    public List<Order> getOrders() {
        return orderService.findAll();
    }
    @DeleteMapping("{id}")
    public void deleteData(@PathVariable Integer id) {orderService.deleteById(id);}

    @GetMapping("{id}")
    public Order findData(@PathVariable Integer id) {return orderService.findById(id);}

}
