package com.mrwilbroad.productsales_from_udemy.controller;


import com.mrwilbroad.productsales_from_udemy.Entity.Product;
import com.mrwilbroad.productsales_from_udemy.Service.ProductService;
import com.mrwilbroad.productsales_from_udemy.payload.Response.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {



    @Autowired
    ProductService productService;

    @GetMapping("/products")
    public List<Product> getAllProducts ()
    {
        return productService.getAllProducts();
    }
}



