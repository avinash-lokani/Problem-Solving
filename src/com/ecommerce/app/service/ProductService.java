package com.ecommerce.app.service;

import com.ecommerce.app.App;

import java.util.List;

public class ProductService {
    public void add(com.ecommerce.app.model.Product product){
        List<com.ecommerce.app.model.Product> productList = App.products;
        if(productList.stream().filter(i -> i.getName().equals(product.getName())).toList() == null){
            productList.add(new com.ecommerce.app.model.Product((long) (productList.size()+1),product.getName(),product.getCost(),product.getQty()));
            App.products = productList;
        }
        else{
            productList.stream().filter(i -> i.getName().equals(product.getName())).forEach(i -> i.setQty(i.getQty() + 1));
        }
    }
    public void searchByName(String name){
        // linear Search
        System.out.println(App.products.stream().filter(i -> i.getName().equals(name)).toList());
    }
    public void searchById(Long id) {
        // Binary Search
        int lowerBound = 0,higherBound = App.products.size() - 1;
        while(lowerBound <= higherBound){
            int mid = (lowerBound+ higherBound)/2;
            Long currentId = App.products.get(mid).getId();
            if(currentId == id){
                System.out.println(App.products.get(mid));
                return;
            }
            else if(currentId > id){
                higherBound = mid - 1;
            }
            else{
                lowerBound = mid + 1;
            }
        }
        System.out.println("the Product is not found");
    }
}
