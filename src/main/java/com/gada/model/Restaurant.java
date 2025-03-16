package com.gada.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "restaurant")
public class Restaurant {

    @Column(name = "id")
    private String id;

    @Column(name = "restaurant_name")
    private String restoName;

    @Column(name = "address")
    private String address;

    @Column(name = "region")
    private String region;

}
