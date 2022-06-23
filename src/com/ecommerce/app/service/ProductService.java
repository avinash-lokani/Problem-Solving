package com.ecommerce.app.service;

import com.ecommerce.app.model.Product;

public class ProductService {
    public void addProduct(com.ecommerce.app.product.Product product){
        Product model = new Product();
        model.addProduct(product);
    }

    public void searchProduct(String name){
        Product model = new Product();
        model.searchProduct(name);
    }

    public void searchProductById(Long id) {
        Product model = new Product();
        model.searchProductById(id);
    }
}
