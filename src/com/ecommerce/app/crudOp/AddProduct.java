package com.ecommerce.app.crudOp;

import com.ecommerce.app.App;
import com.ecommerce.app.product.Product;

import java.util.List;

public class AddProduct {
    public  void addProduct(String productName, int price, int qty) {

        List<Product> productList = App.getProducts();

        if(productList.stream().filter(i -> i.getName().equals(productName)).toList() == null){
            productList.add(new Product((long) (productList.size()+1),productName,price,qty));
            App.setProducts(productList);
        }
        else{
            productList.stream().filter(i -> i.getName().equals(productName)).forEach(i -> i.setQty(i.getQty() + 1));
        }


    }

}
