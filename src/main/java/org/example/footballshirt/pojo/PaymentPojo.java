package org.example.footballshirt.pojo;


import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class PaymentPojo {
    private int payment_id;

    @NotEmpty(message = "payment_method is required")
    private String payment_method;

    @NotEmpty(message = "amount is required")
    private String amount;

    @NotEmpty(message = "transaction_date is required")
    private String transaction_date;

}
