package com.ecommerce.app.service;
import com.ecommerce.app.App;

import com.ecommerce.app.model.Cart;
import com.ecommerce.app.model.Product;

public class CartService {
    private  Cart cart = new Cart();
    private ProductService service = new ProductService();
    public void add(Long id){
        if(service.searchById(id) != null){
            cart.getProducts().add(service.searchById(id));
        }
    }
    public void delete(Long id){
        if(App.products.size() > id)
            cart.getProducts().remove(service.searchById(id));
    }
    public void checkOut(){
        double totalSum = 0;
        for(Product p : cart.getProducts()){
            totalSum += p.getCost();
        }
        System.out.println("generating bill");
        System.out.println("products = " + cart.getProducts());
        System.out.println("total value = " + totalSum);
    }
}
