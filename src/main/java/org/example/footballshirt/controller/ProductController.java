package org.example.footballshirt.controller;


import lombok.RequiredArgsConstructor;
import org.example.footballshirt.entity.Product;
import org.example.footballshirt.pojo.ProductPojo;
import org.example.footballshirt.service.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("product")
@RequiredArgsConstructor

public class ProductController {
    private final ProductService productService;

    @PostMapping
    public void savaData(@RequestBody ProductPojo productPojo) {
        productService.saveProduct(productPojo);
    }

    @GetMapping
    public List<Product> findAll() {
        return this.productService.findAll();
    }

    @DeleteMapping("{id}")
    public void deleteData(@PathVariable Integer id) {productService.deleteById(id);}

    @GetMapping("{id}")
    public Product findData(@PathVariable Integer id) {return productService.findById(id);}
}

