package com.ecommerce.app.service;
import com.ecommerce.app.App;

import com.ecommerce.app.model.Cart;

public class CartService {
    private  static Cart cart = new Cart();
    private static double totalSum = 0;
    public void add(Long id){
        cart.getProducts().add(App.products.get(id.intValue()));
    }
    public void delete(Long id){
        if(App.products.size() > id)
            cart.getProducts().remove(App.products.get(id.intValue()));
    }
    public void checkOut(){
        cart.getProducts().stream().forEach(i -> totalSum = totalSum + i.getCost());
        System.out.println("generating bill");
        System.out.println("products = " + cart.getProducts());
        System.out.println("total value = " + totalSum);
    }
}
