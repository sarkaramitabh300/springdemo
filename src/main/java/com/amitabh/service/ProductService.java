package com.amitabh.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amitabh.dao.ProductDao;
import com.amitabh.dto.Products;

@Service
public class ProductService {

  @Autowired
  ProductDao productDao;

  public Products saveProducts(Products products) {
    return productDao.saveProducts(products);
  }

}
