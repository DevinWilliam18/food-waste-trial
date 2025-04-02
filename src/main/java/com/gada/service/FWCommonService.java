package com.gada.service;

import com.gada.dto.CartVO;
import com.gada.dto.ProductVO;
import com.gada.model.Cart;
import com.gada.model.Product;

public interface FWCommonService {

    ProductVO converToProductVO (Product product);

    Cart converToCart(CartVO vo);

}
