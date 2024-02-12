package com.amitabh.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.amitabh.dto.Products;

public interface ProductRepository extends JpaRepository<Products, Integer> {
  
}
