package com.gada.service.impl;


import com.gada.dao.CartDao;
import com.gada.dao.ProductDao;
import com.gada.dto.CartVO;
import com.gada.dto.ProductVO;
import com.gada.model.Cart;
import com.gada.model.Product;
import com.gada.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartDao cartDao;

    @Autowired
    private ProductDao productDao;


    @Override
    public CartVO createOrUpdateCart(HttpServletRequest request) {

        HttpSession session = request.getSession(true);

        CartVO cart = (CartVO) session.getAttribute("cart");

        return cart;
    }

    @Override
    public void addFoodToCart(String id, HttpServletRequest request) {
        //check the existing session
        CartVO sessionCart = createOrUpdateCart(request);

        if (sessionCart == null){
//          sessionCart
//      sess
        }else{
            //get the selected food by id
            Product product = productDao.getById(id);

            //update the food list within cart
            List<ProductVO> productList = sessionCart.getProducts();
            productList.add(converToProductVO(product));
        }


        Cart cart = converToCart(sessionCart);

        cartDao.save(cart);

        request.getSession().setAttribute("cart", sessionCart);

    }

    public Cart converToCart(CartVO vo){
        Cart cart = new Cart();
        //

        return cart;
    }

    public ProductVO converToProductVO (Product product){
        ProductVO productVO = new ProductVO();

        productVO.setId(product.getId());
        productVO.setName(product.getName());
        productVO.setDesc(product.getDesc());
        productVO.setPrice(product.getPrice());
        productVO.setQty(product.getQty());
        productVO.setExpiredAt(product.getExpiredAt());

        return productVO;
    }


}