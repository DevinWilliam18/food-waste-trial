package com.gada.dao;


import com.gada.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class CartDao extends JpaRepository<Cart, String> {

}
