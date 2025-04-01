package com.gada.dao;


import com.gada.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDao extends JpaRepository<Product, String> {

}
