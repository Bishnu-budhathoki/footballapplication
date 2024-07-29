package org.example.footballshirt.pojo;

public interface PaymentProjection {

    Integer getId();

    String getPaymentId();

    String getAmount();

    String getTransactionDate();

    String getPaymentMethod();
}
