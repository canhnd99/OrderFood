package com.laptrinhb2a.app.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "item")
public class Item implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false, length = 45)
    private String code;

    @Column(nullable = false, length = 145)
    private String name;

    @Column(nullable = false)
    private Double price;

    @Column(nullable = false)
    private Integer quantity;

    @Column(nullable = false, length = 256)
    private String origin;

    @ManyToOne
    @JoinColumn(name = "category_id")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Category category;

    @OneToMany(mappedBy = "item")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private List<OrderItems> orderItems;

    @ManyToMany(mappedBy = "items")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private List<Menu> menus;
}
