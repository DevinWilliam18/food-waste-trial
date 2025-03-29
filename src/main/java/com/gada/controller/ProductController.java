package com.gada.controller;


import com.gada.model.Product;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("/product")
public class ProductController {

    @PostMapping("/add")
    private String addView(@RequestParam){

    }

    @GetMapping("/show")
    private String showPage(Model model){
        model.addAttribute();

        return "";
    }

    @GetMapping("/search")
    private String search(){

    }

    private List<Product> getAllFoods(){
        List<Product> foods = new ArrayList<>();

        return foods;
    }



}
