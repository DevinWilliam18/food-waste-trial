package com.gada.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "menu")
public class Menu {

    @Id
    @Column(name = "cd")
    private String cd;

    @Column(name = "mnu_name")
    private String name;

}
