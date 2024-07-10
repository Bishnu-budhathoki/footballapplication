package org.example.footballshirt.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.footballshirt.entity.Product;
import org.example.footballshirt.pojo.ProductPojo;
import org.example.footballshirt.repository.ProductRepository;
import org.example.footballshirt.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;
    @Override
    public Integer saveProduct(ProductPojo productPojo) {
        Product product = new Product();
        product.setProductName(productPojo.getProductName());
        product.setProductPrice(productPojo.getProductPrice());
        productRepository.save(product);
        return product.getProduct_id();
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product findById(Integer id) {
        return productRepository.findById(id).orElse(null);

    }

    @Override
    public void deleteById(Integer id) {
        productRepository.deleteById(id);

    }
}
