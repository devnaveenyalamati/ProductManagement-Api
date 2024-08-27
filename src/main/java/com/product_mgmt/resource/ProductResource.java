package com.product_mgmt.resource;

import com.product_mgmt.entity.Product;
import com.product_mgmt.resource.api.ProductAPI;
import com.product_mgmt.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductResource implements ProductAPI {

    @Autowired
    private ProductService productService;

    public Product createProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }

    public Product getProduct(@PathVariable Long id) {
        return productService.getProductById(id);
    }

    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    public Product updateProduct(@PathVariable Long id, @RequestBody Product productDetails) {
        return productService.updateProduct(id, productDetails);
    }

    public void deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
    }
}

