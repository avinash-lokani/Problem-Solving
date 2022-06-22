package com.ecommerce.app.constants;

import com.ecommerce.app.product.Product;

import java.util.ArrayList;
import java.util.List;

public class Constants {

    private List<Product> cartList = new ArrayList<>();
    private int cartValue = 0;

    public List<Product> getCartList() {
        return cartList;
    }

    public void addToCart(Product product){
        cartList.add(product);
    }

    public void setCartList(List<Product> cartList) {
        this.cartList = cartList;
    }

    public int getCartValue() {
        return cartValue;
    }

    public void setCartValue(int cartValue) {
        this.cartValue += cartValue;
    }
}
