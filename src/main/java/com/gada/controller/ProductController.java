package com.gada.controller;


import com.gada.model.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/product")
public class ProductController {

    private String PRODUCT_MAIN_PAGE = "templates/buyer/food_page.html";


    @GetMapping("/show")
    private String showPage(Model model){
        model.addAttribute("","");
        return "";
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
