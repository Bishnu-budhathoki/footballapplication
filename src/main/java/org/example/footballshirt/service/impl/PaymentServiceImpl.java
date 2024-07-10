package org.example.footballshirt.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.footballshirt.entity.Payment;
import org.example.footballshirt.pojo.PaymentPojo;
import org.example.footballshirt.repository.PaymentRepository;
import org.example.footballshirt.service.PaymentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PaymentServiceImpl implements PaymentService {
    private final PaymentRepository paymentRepository;

    @Override
    public Integer savePayment(PaymentPojo paymentPojo) {
        Payment payment = new Payment();
        payment.setPayment_id(paymentPojo.getPayment_id());
        payment.setPaymentMethod(paymentPojo.getPayment_method());
        payment.setAmount(paymentPojo.getAmount());
        paymentRepository.save(payment);
        return payment.getPayment_id();
    }

    @Override
    public List<Payment> findAll() {
        return paymentRepository.findAll();
    }

    @Override
    public Payment findById(Integer id) {
        return paymentRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteById(Integer id) {
        paymentRepository.deleteById(id);

    }
}
