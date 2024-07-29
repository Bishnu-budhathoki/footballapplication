package org.example.footballshirt.controller;


import lombok.RequiredArgsConstructor;
import org.example.footballshirt.entity.Payment;
import org.example.footballshirt.pojo.GlobalApiResponse;
import org.example.footballshirt.pojo.PaymentPojo;
import org.example.footballshirt.service.PaymentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("payment")
@RequiredArgsConstructor
public class PaymentController {
    private final PaymentService paymentService;

    @PostMapping
    public GlobalApiResponse<Integer> saveData(@RequestBody PaymentPojo  paymentPojo){
        GlobalApiResponse<Integer> globalApiResponse = new GlobalApiResponse<>();
        Integer id = paymentService.savePayment(paymentPojo);
        globalApiResponse.setData(id);
        globalApiResponse.setStatus(200);
        globalApiResponse.setMessage("Payment saved successfully");
        return globalApiResponse;
    }
    @GetMapping
    public GlobalApiResponse <List<Payment>> getAll(){
        GlobalApiResponse<List<Payment>> globalApiResponse = new GlobalApiResponse<>();
        globalApiResponse.setData(paymentService.findAll());
        globalApiResponse.setStatus(200);
        globalApiResponse.setMessage("Data retrieved successfully");
        return globalApiResponse;
    }
    @DeleteMapping("/delete/{id}")
    public GlobalApiResponse<Integer> deleteData(@PathVariable Integer id) {
        GlobalApiResponse<Integer> globalApiResponse = new GlobalApiResponse<>();
        paymentService.deleteById(id);
        globalApiResponse.setData(null);
        globalApiResponse.setStatus(200);
        globalApiResponse.setMessage("Payment deleted successfully");
        return globalApiResponse;
    }

    @GetMapping("/getById{id}")
    public GlobalApiResponse<Payment> findData(@PathVariable Integer id) {
        GlobalApiResponse<Payment> globalApiResponse = new GlobalApiResponse<>();
        globalApiResponse.setData(paymentService.findById(id));
        globalApiResponse.setStatus(200);
        globalApiResponse.setMessage("Payment retrieved successfully");

        return globalApiResponse;}
}
