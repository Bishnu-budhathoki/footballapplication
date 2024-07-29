package org.example.footballshirt.controller;


import lombok.RequiredArgsConstructor;
import org.example.footballshirt.entity.Product;
import org.example.footballshirt.pojo.GlobalApiResponse;
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
    public  GlobalApiResponse<Integer> savaProduct(@RequestBody ProductPojo productPojo) {
        GlobalApiResponse<Integer>globalApiResponse = new GlobalApiResponse<>();
        Integer id=productService.saveProduct(productPojo);
        globalApiResponse.setData(id);
        globalApiResponse.setStatus(200);
        globalApiResponse.setMessage("product save successfully");
        return globalApiResponse;
    }

    @GetMapping
    public GlobalApiResponse <List<Product>> findAll() {
        GlobalApiResponse<List<Product>> globalApiResponse = new GlobalApiResponse<>();
        globalApiResponse.setData(productService.findAll());
        globalApiResponse.setStatus(200);
        globalApiResponse.setMessage("Data retrieved successfully");
        return globalApiResponse;
    }

    @DeleteMapping("/delete/{id}")
    public GlobalApiResponse<Integer> deleteData(@PathVariable Integer id) {
        GlobalApiResponse<Integer>globalApiResponse = new GlobalApiResponse<>();
        productService.deleteById(id);
        globalApiResponse.setData(null);
        globalApiResponse.setStatus(200);
        globalApiResponse.setMessage("Data deleted successfully");
        return globalApiResponse;}

    @GetMapping("/getById{id}")
    public GlobalApiResponse<Product> findData(@PathVariable Integer id) {
        GlobalApiResponse<Product> globalApiResponse = new GlobalApiResponse<>();
        globalApiResponse.setData(productService.findById(id));
        globalApiResponse.setStatus(200);
        globalApiResponse.setMessage("Data retrieved successfully");
        return globalApiResponse;}
}

