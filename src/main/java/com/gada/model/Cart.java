package com.gada.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;


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
    @Column(name = "created_at")
    private Timestamp createdAt;

    @Column(name = "updated_at")
    private Timestamp updatedAt;

}
