package com.laptrinhb2a.app.entity;

import lombok.*;

import javax.persistence.*;
import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "payment")
public class PaymentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 15)
    private Date paymentDate;

    @Column(nullable = false)
    private Double fee;

    @Column(nullable = false, length = 45)
    private String paymentType;

    @ManyToOne
    @JoinColumn(name = "order_items_id")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private OrderItemsEntity orderItems;
}
