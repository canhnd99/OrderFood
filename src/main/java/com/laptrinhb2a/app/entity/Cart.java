package com.laptrinhb2a.app.entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cart")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 15)
    private Date orderDate;

    @Column(nullable = false)
    private Integer quantity;

    @ManyToMany
    @JoinTable(name = "cart_order_item",
            joinColumns = @JoinColumn(name = "cart_id"),
            inverseJoinColumns = @JoinColumn(name = "order_item_id")
    )
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private List<OrderItems> orderItems;
}
