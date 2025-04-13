package com.gada.controller;

import com.gada.model.Cart;
import com.gada.service.CartService;
import com.gada.service.impl.CartServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/cart")
public class CartController {

    private String CART_MAIN_PAGE = "templates/buyer/cart_page.html";

    @Autowired
    private CartService cartService;

    @PostMapping("/add")
    private ResponseEntity<Map<String, String>> add(@RequestParam String id, HttpServletRequest request){

        Map<String, String> response = new HashMap<>();
        try{
            cartService.addFoodToCart(id, request);
            //call service class




        }catch(Exception e){
            response.put("status", "success");
            response.put("code", "");
            response.put("message", e.getMessage());
            return ResponseEntity.badRequest().body(response);
        }

        response.put("status", "success");
        response.put("code", "");
        response.put("message", "");

        return ResponseEntity.ok(response);
    }

    @GetMapping("/remove-cart")
    private ResponseEntity<Map<String, String>> remove(@RequestParam String id){
        // check if the item still exists

        //delete service
        Map<String, String> response = new HashMap<>();
        try{

        }catch(Exception e){
            response.put("", "");
            response.put("", "");
            response.put("", "");

            return ResponseEntity.badRequest().body(response);
        }

        response.put("", "");
        response.put("", "");
        response.put("", "");

        return ResponseEntity.ok(response);
    }

    @GetMapping("/show")
    private String show (Model model){

        List<Cart> cartList = getAllCarts();

        model.addAttribute("items",cartList);

        return CART_MAIN_PAGE;
    }

    private List<Cart> getAllCarts(){
        List<Cart> cartList = new ArrayList<>();

        return cartList;
    }

}