package org.example.footballshirt.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "payment_table")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Payment {
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "information_seq_gen")
    @SequenceGenerator(name = "information_seq_gen",sequenceName = "information_seq",allocationSize = 1,initialValue = 1)
    @Id
    private Integer payment_id;

    @Column(name = "payment_method",length = 255)
    private String paymentMethod;

    @Column(name = "amount",length = 255)
    private String amount;

    @Column(name = "transaction_date",length = 255)
    private String transactionDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id",referencedColumnName = "order_id", foreignKey = @ForeignKey(name = "fk_user_payment"))
    private Order orderId;
}
