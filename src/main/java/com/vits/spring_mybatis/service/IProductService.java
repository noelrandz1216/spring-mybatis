package com.vits.spring_mybatis.service;

import java.math.BigDecimal;
import java.util.List;

import com.vits.spring_mybatis.model.Product;

public interface IProductService {
    Product addProduct(Product product);
    Product updateProductPrice(Product product);
    void deleteProduct(int id);
    Product getById(int id);
    List<Product> getAll();
    List<Product> getByBrand(String brand);
    List<Product> getByLesserPrice(BigDecimal price);
}
