package com.product_mgmt.resource.api;

import com.product_mgmt.entity.Product;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/api/products")
public interface ProductAPI {

    @PostMapping
    Product createProduct(@RequestBody Product product);

    @GetMapping("/{id}")
    Product getProduct(@PathVariable("id") Long id);

    @GetMapping
    List<Product> getAllProducts();

    @PutMapping("/{id}")
    Product updateProduct(@PathVariable("id") Long id, @RequestBody Product productDetails) ;
    @DeleteMapping("/{id}")
    void deleteProduct(@PathVariable("id") Long id);
}
