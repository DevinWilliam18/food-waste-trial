package com.gada.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Data
@Entity
@Table(name = "cart")
public class Cart {


    @Id
    @Column(name = "id")
    private String id;


    @Column(name = "qty")
    private Integer qty;

    @Column(name = "staus")
    private String status;

    @ManyToOne
    @JoinColumn(name = "id")
    private UserProfile user;

    @ManyToMany
    @JoinTable(name = "cart_product",
        joinColumns = @JoinColumn(name = "cart_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "product_id", referencedColumnName = "id")
    )
    private Set<Product> foods = new HashSet<>();

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;

}
