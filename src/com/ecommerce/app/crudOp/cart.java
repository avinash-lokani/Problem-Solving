package com.ecommerce.app.crudOp;

import com.ecommerce.app.product.Product;

import java.util.ArrayList;
import java.util.List;

import com.ecommerce.app.constants.*;


public class cart {

    private Constants constants = new Constants();;

    public void addProductToCart(Long id, List<Product> products){

        constants.addToCart(products.get(id.intValue()));
        constants.setCartValue(products.get(id.intValue()).getCost());
    }

    public void deleteProductInCart(Long id){

        if(constants.getCartList().size() > id.intValue()){
            List<Product> tempList = new ArrayList<>();
            tempList = constants.getCartList();
            tempList.remove(id.intValue());
            constants.setCartList(tempList);
        }
    }


    public void buyCart(){
        System.out.println("generating bill");
        System.out.println("products = " + constants.getCartList());
        System.out.println("total value =" + constants.getCartValue());

    }


}
