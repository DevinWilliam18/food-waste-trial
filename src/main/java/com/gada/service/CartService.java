package com.gada.service;

import com.gada.dto.CartVO;
import com.gada.model.Cart;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public interface CartService {

    CartVO createOrUpdateCart(HttpServletRequest request);
    void addFoodToCart(String id, HttpServletRequest request);

}
