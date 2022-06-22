package com.ecommerce.app.model;

import com.ecommerce.app.App;
import com.ecommerce.app.product.Product;
import java.util.ArrayList;
import java.util.List;

public class Cart {

    private static final List<Product> cartList = new ArrayList<>();
    private static int cartValue = 0;
    public void addProduct(Long id, List<Product> products){
        cartList.add(products.get(id.intValue()));
        cartValue += products.get(id.intValue()).getCost();
    }
    public void deleteProduct(Long id){
        if(App.getProducts().size() > id)
            cartList.remove(App.getProducts().get(id.intValue()));
    }
    public void checkOut(){
        System.out.println("generating bill");
        System.out.println("products = " + cartList);
        System.out.println("total value =" + cartValue);
    }
}
