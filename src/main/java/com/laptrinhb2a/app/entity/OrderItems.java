package com.laptrinhb2a.app.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "order_item")
public class OrderItems {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false, length = 45)
    private String code;

    @Column(nullable = false)
    private Integer quantity;

    @Column(nullable = false)
    private Double price;

    @ManyToOne
    @JoinColumn(name = "item_id")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Item item;

    @OneToMany(mappedBy = "orderItems")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private List<Payment> payment;
}
