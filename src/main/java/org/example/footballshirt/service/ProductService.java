package org.example.footballshirt.service;

import org.example.footballshirt.entity.Product;
import org.example.footballshirt.pojo.ProductPojo;

import java.util.List;

public interface ProductService {

    Integer

    saveProduct(ProductPojo productPojo);

    List<Product> findAll();

    Product findById(Integer id);

    void deleteById(Integer id);
}
