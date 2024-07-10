package org.example.footballshirt.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "products", uniqueConstraints = {
        @UniqueConstraint(name = "unique_product",
        columnNames={"product_name"})
})

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "information_seq_gen")
    @SequenceGenerator(name = "information_seq_gen",sequenceName = "information_seq",allocationSize = 1,initialValue = 1)
    @Id

    private Integer product_id;

    @Column(name ="product_name",length = 255)
    private String productName;

    @Column(name = "product_price",length = 255)
    private Integer productPrice;
}
