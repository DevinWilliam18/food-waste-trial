package com.gada.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "user_role")
public class UserRole {

    @Id
    private String id;

    @Column(name = "role_name")
    private String name;

}
