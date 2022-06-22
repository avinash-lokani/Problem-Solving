package com.ecommerce.app.service;

import com.ecommerce.app.App;
import com.ecommerce.app.model.AddProduct;
import com.ecommerce.app.model.Cart;

public class CartService {

    private Cart cart = new Cart();

    public void addProduct(Long id){
        cart.addProduct(id, App.getProducts());
    }

    public void deleteProduct(Long id){
        cart.deleteProduct(id);
    }

    public void checkOut(){
       cart.checkOut();
    }

}
