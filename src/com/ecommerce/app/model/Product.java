package com.ecommerce.app.model;

import com.ecommerce.app.App;

import java.util.List;

public class Product {
    public  void addProduct(com.ecommerce.app.product.Product product) {

        List<com.ecommerce.app.product.Product> productList = App.getProducts();

        if(productList.stream().filter(i -> i.getName().equals(product.getName())).toList() == null){
            productList.add(new com.ecommerce.app.product.Product((long) (productList.size()+1),product.getName(),product.getCost(),product.getQty()));
            App.setProducts(productList);
        }
        else{
            productList.stream().filter(i -> i.getName().equals(product.getName())).forEach(i -> i.setQty(i.getQty() + 1));
        }

    }

    public void searchProduct(String name) {
        // linear Search
        System.out.println(App.getProducts().stream().filter(i -> i.getName().equals(name)).toList());
    }

    public void searchProductById(Long id) {
        // Binary Search
        int lowerBound = 0,higherBound = App.getProducts().size() - 1;
        while(lowerBound <= higherBound){
            int mid = (lowerBound+ higherBound)/2;
            Long currentId = App.getProducts().get(mid).getId();
            if(currentId == id){
                System.out.println(App.getProducts().get(mid));
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
