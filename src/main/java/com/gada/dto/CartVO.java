package com.gada.dto;

import com.gada.model.UserProfile;
import lombok.Data;

import java.util.List;

@Data
public class CartVO {
    private String id;

    private int qty;

    private String status;

    private UserProfile user;

    private List<ProductVO> products;

}
