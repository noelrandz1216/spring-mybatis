package com.vits.spring_mybatis.model;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {
    private String productName;
    private Integer productId;
    private BigDecimal price;
    private String brand;
    private String category;

    public Product() {
    }

    public Product(String productName, BigDecimal price, String brand, String category) {
        this.productName = productName;
        this.price = price;
        this.brand = brand;
        this.category = category;
    }
}
