package com.gada.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "category")
public class Category {

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "category_name")
    private String categoryName;

}
