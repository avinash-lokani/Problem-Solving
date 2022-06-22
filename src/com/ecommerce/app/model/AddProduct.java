package com.ecommerce.app.model;

import com.ecommerce.app.App;
import com.ecommerce.app.product.Product;

import java.util.List;

public class AddProduct {
    public  void addProduct(Product product) {

        List<Product> productList = App.getProducts();

        if(productList.stream().filter(i -> i.getName().equals(product.getName())).toList() == null){
            productList.add(new Product((long) (productList.size()+1),product.getName(),product.getCost(),product.getQty()));
            App.setProducts(productList);
        }
        else{
            productList.stream().filter(i -> i.getName().equals(product.getName())).forEach(i -> i.setQty(i.getQty() + 1));
        }

    }

}
