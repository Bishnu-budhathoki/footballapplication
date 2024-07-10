package org.example.footballshirt.controller;


import lombok.RequiredArgsConstructor;
import org.example.footballshirt.entity.Payment;
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
    public void saveData(@RequestBody PaymentPojo  paymentPojo){
        paymentService.savePayment(paymentPojo);
    }
    @GetMapping
    public List<Payment> getAll(){
        return paymentService.findAll();
    }
    @DeleteMapping("{id}")
    public void deleteData(@PathVariable Integer id) {paymentService.deleteById(id);}

    @GetMapping("{id}")
    public Payment findData(@PathVariable Integer id) {return paymentService.findById(id);}
}
