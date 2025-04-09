package com.gada.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "restaurant")
public class Restaurant {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "restaurant_name")
    private String restoName;

    @Column(name = "address")
    private String address;

    @Column(name = "region")
    private String region;

}
