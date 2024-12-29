package com.mrwilbroad.productsales_from_udemy.Service;

import com.mrwilbroad.productsales_from_udemy.Entity.Product;
import com.mrwilbroad.productsales_from_udemy.Repo.ProductRepo;
import com.mrwilbroad.productsales_from_udemy.payload.Response.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {


    @Autowired
    private ProductRepo productRepo;

    public List<Product> getAllProducts() {
        List<Product> products =  productRepo.findAll();
//        return new BaseResponse<>("frf",3400,false,new Product());
        return products;
    }
}
