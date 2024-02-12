package com.amitabh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.amitabh.dto.Products;
import com.amitabh.service.ProductService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class ProductController {
  @Autowired
  ProductService productService;

  @PostMapping("/pmo")
  public Products saveProducts(@RequestBody Products products) {
    return productService.saveProducts(products);

  }

  @GetMapping("/abc")
  public String getMethodName() {
    return "ABC";
  }

}
