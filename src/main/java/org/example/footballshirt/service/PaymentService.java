package org.example.footballshirt.service;

import org.example.footballshirt.entity.Payment;
import org.example.footballshirt.pojo.PaymentPojo;

import java.util.List;

public interface PaymentService {

    Integer

    savePayment(PaymentPojo paymentPojo);

    List<Payment>findAll();

    Payment findById(Integer id);

    void deleteById(Integer id);


}
