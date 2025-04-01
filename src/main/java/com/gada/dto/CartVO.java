package com.gada.dto;

import lombok.Data;

import java.util.List;

@Data
public class CartVO {
    private String id;

    private int qty;

    private String status;

    private List<ProductVO> products;

}
