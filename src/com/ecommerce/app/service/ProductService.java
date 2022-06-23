package com.ecommerce.app.service;

import com.ecommerce.app.App;
import com.ecommerce.app.model.Product;

import java.util.List;

public class ProductService {
    public void add(Product product){
        List<Product> productList = App.products;
        if(!productList.contains(product)){
            productList.add(new Product(Long.valueOf(productList.size()+1),product.getName(),product.getCost(),product.getQty()));
        }
        else{
            productList.stream().filter(i -> i.getName().equals(product.getName())).forEach(i -> i.setQty(i.getQty() + product.getQty()));
        }
    }
    public void searchByName(String name){
        // linear Search
        System.out.println(App.products.stream().filter(i -> i.getName().equals(name)).toList());
    }
    public Product searchById(Long id) {
        // Binary Search
        int lowerBound = 0,higherBound = App.products.size() - 1,flg = 0,mid = (lowerBound + higherBound )/2;
        while(lowerBound <= higherBound){
            mid = (lowerBound+ higherBound)/2;
            Long currentId = App.products.get(mid).getId();
            if(currentId == id){
                flg = 1;
                break;
            }
            else if(currentId > id){
                higherBound = mid - 1;
            }
            else{
                lowerBound = mid + 1;
            }
        }
       if(flg == 1)
           return App.products.get(mid);
       return null;
    }
}
