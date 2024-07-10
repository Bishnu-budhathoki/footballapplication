package org.example.footballshirt.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "order_table")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "order_id_seq_gen")
    @SequenceGenerator(name = "order_id_seq_gen",sequenceName = "order_id_seq",allocationSize = 1,initialValue = 1)
    @Id

    private Integer order_id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", foreignKey = @ForeignKey(name = "fk_order_product_id"))
    private Product productId;

    @Column(name ="quantity",length = 255)
    private Integer quantity;

    @Column(name = "date",length = 255)
    private Integer date;

    @Column(name = "total_price",length = 255)
    private Double totalPrice;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id",referencedColumnName = "user_id", foreignKey = @ForeignKey(name = "fk_order_user_Id"))
    private User userId;

}
