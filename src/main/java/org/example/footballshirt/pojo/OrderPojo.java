package org.example.footballshirt.pojo;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.footballshirt.entity.User;

@Setter
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class OrderPojo {
    private User order_id;

    @NotEmpty(message = "userid is required")
    private Integer userId;

    @NotEmpty(message = "productid is required")
    private Integer productId;

    @NotNull(message = "quantity is required")
    private Integer quantity;

    @NotNull(message = "total_price is required")
    private Double totalPrice;

    @NotEmpty(message = "date is required")
    private Integer date;
}
