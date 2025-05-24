package com.gada.controller;


import com.gada.dto.ProductVO;
import com.gada.model.Menu;
import com.gada.model.Product;
import com.gada.service.MenuService;
import com.gada.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@RequestMapping("/product")
@Controller
public class ProductController {

    private String PRODUCT_MAIN_PAGE = "buyer/food_page";

    @Autowired
    private MenuService menuService;

    @Autowired
    private ProductService productService;

    @Autowired
    private ModelMapper modelMapper;

    @GetMapping()
    private String showPage(Model model){
        log.info("masuk");
        //authentication

        List<Menu> menuList = menuService.get();

        List<Product> productList = productService.get();
        for (Menu menu: menuList) {
            log.info("name: {}", menu.getName());
            log.info("source: {}", menu.getPathSource());
            log.info("\n");
        }
        model.addAttribute("menuList",menuList);
        model.addAttribute("products", productList.stream().map(this::convertToProductVO));

        return PRODUCT_MAIN_PAGE;
    }



//    @GetMapping("/show-detail")
//    private String detail(@RequestParam String id){
//
//        // call a service class to rediect user to the detail page (stored the response into string variable)
//
//
//    }

//    @GetMapping("/search")
//    private ResponseEntity<Product> search(@RequestParam){
//
//    }

    private ProductVO convertToProductVO(Product product){
        ProductVO productVO = modelMapper.map(product, ProductVO.class);

        return productVO;
    }

}
