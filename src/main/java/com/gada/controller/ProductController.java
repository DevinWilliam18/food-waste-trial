package com.gada.controller;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/product")
public class ProductController {

    @PostMapping("/add")
    private String addView(@RequestParam){

    }

    @GetMapping("/")
    private String showPage(Model model){

    }

}
