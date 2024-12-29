package com.mrwilbroad.productsales_from_udemy.Repo;

import com.mrwilbroad.productsales_from_udemy.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo  extends JpaRepository<Product, Integer> {

}
