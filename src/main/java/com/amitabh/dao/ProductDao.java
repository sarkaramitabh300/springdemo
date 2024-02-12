package com.amitabh.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.amitabh.dto.Products;
import com.amitabh.repository.ProductRepository;

@Repository
public class ProductDao {
  @Autowired
  ProductRepository productRepository;

  @SuppressWarnings("null")
  public Products saveProducts(Products products) {
    return productRepository.save(products);

  }
}
