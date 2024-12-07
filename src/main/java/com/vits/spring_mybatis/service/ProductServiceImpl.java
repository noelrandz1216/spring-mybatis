package com.vits.spring_mybatis.service;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vits.spring_mybatis.model.Product;
import com.vits.spring_mybatis.repository.IProductRepository;

@Service
public class ProductServiceImpl implements IProductService{

    @Autowired
    IProductRepository productRepository;

    @Override
    public Product addProduct(Product product) {
        return productRepository.addProduct(product);
    }

    @Override
    public Product updateProductPrice(Product product) {
        return productRepository.updateProductPrice(product);
    }

    @Override
    public void deleteProduct(int id) {
        productRepository.deleteProduct(id);
    }

    @Override
    public Product getById(int id) {
        return productRepository.getById(id);
    }

    @Override
    public List<Product> getAll() {
        return productRepository.getAll();
    }

    @Override
    public List<Product> getByBrand(String brand) {
        return productRepository.getByBrand(brand);
    }

    @Override
    public List<Product> getByLesserPrice(BigDecimal price) {
        return productRepository.getByLesserPrice(price);
    }

}
