package com.gada.controller;


import com.gada.model.Menu;
import com.gada.model.Product;
import com.gada.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/product")
public class ProductController {

    private String PRODUCT_MAIN_PAGE = "templates/buyer/food_page.html";

    @Autowired
    private MenuService menuService;

    @GetMapping("/")
    private String showPage(Model model){
        //authentication

        List<Menu> menuList = menuService.get();
        model.addAttribute("menuList",menuList);
        return PRODUCT_MAIN_PAGE;
    }

    @GetMapping("/show-detail")
    private String detail(@RequestParam String id){

        // call a service class to rediect user to the detail page (stored the response into string variable)


    }

    @GetMapping("/search")
    private ResponseEntity<Product> search(@RequestParam){

    }

    private List<Product> getAllFoods(){
        List<Product> foods = new ArrayList<>();

        return foods;
    }

}
