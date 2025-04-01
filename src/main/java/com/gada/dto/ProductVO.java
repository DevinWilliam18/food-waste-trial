package com.gada.dto;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class ProductVO {
    private String id;

    private String name;

    private String desc;

    private Double price;

    private Integer qty;

    private Timestamp expiredAt;
}
