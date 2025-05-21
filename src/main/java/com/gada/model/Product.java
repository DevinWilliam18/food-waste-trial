package com.gada.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "product")
public class Product {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String desc;

    @ManyToMany(mappedBy = "products")
    private Set<Cart> carts;

    @Column(name = "price")
    private Double price;

    @Column(name = "qty")
    private Integer qty;

    @Column(name = "expired_at")
    private Timestamp expiredAt;

    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;
}
