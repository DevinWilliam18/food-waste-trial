package com.gada.model;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "menu")
public class Menu {

    @Id
    @Column(name = "cd")
    private String cd;

    @Column(name = "mnu_name")
    private String name;

    @Column(name = "path_src")
    private String pathSource;

    @Column(name = "path_url")
    private String pathUrl;

}
