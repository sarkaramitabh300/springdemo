package com.amitabh.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "PRODUCT_MASTER")

public class Products {

  @Id
  private int productNo;
  private int code;
  private String crtd_by;
  private int crdt_dt;
  private String description;
  private float price;

  // getters and setters
  public int getProductNo() {
    return productNo;
  }

  public int getCode() {
    return code;
  }

  public String getCrtd_by() {
    return crtd_by;
  }

  public int getCrdt_dt() {
    return crdt_dt;
  }

  public String getDescription() {
    return description;
  }

  public float getPrice() {
    return price;
  }

  // setters
  public void setProductNo(int productNo) {
    this.productNo = productNo;
  }

  public void setCode(int code) {
    this.code = code;
  }

  public void setCrtd_by(String crtd_by) {
    this.crtd_by = crtd_by;
  }

  public void setCrdt_dt(int crdt_dt) {
    this.crdt_dt = crdt_dt;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public void setPrice(float price) {
    this.price = price;
  }

}
