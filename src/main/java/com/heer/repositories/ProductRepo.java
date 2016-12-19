package com.heer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import model.Product;

public interface ProductRepo extends JpaRepository<Product, String>{

}
