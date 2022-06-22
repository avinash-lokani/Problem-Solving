package com.ecommerce.app.service;

import com.ecommerce.app.model.AddProduct;
import com.ecommerce.app.product.Product;

public class ProductService {
    public void addProduct(Product product){
        AddProduct model = new AddProduct();
        model.addProduct(product);
    }

}
