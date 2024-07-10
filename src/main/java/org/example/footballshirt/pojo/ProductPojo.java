package org.example.footballshirt.pojo;


import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class ProductPojo {
    private Integer product_id;

    @NotEmpty(message = "productname is required")
    private String productName;

    @NotNull(message = "productprice is required")
    private Integer productPrice;
}
