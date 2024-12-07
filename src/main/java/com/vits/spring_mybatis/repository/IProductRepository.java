package com.vits.spring_mybatis.repository;

import java.math.BigDecimal;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.vits.spring_mybatis.model.Product;

@Mapper
public interface IProductRepository {

    @Insert("insert into product(product_name,price, brand, category) values(#{productName}, #{price}, #{brand},#{category})")
    Product addProduct(Product product);

    @Update("update product set price=#{price} where product_id={#productId}")
    Product updateProductPrice(Product product);

    @Delete("delete from product where product_id = #{productId}")
    void deleteProduct(int id);

    @Select("select * from product where product_id = #{productId}")
    @Results({
        @Result(property = "productId", column = "product_id"),
        @Result(property = "productName", column = "product_name"),
        @Result(property = "price", column = "price")
    })
    Product getById(int id);

    @Select("select * from product where product_id > #{productId}")
    @Results({
        @Result(property = "productId", column = "product_id"),
        @Result(property = "productName", column = "product_name"),
        @Result(property = "price", column = "price")
    })
    List<Product> getAll();

    @Select("select * from product where brand = #{brand}")
    @Results({
        @Result(property = "productId", column = "product_id"),
        @Result(property = "productName", column = "product_name"),
        @Result(property = "price", column = "price")
    })
    List<Product> getByBrand(String brand);

    @Select("select * from product where price = #{price}")
    List<Product> getByLesserPrice(BigDecimal price);
}
