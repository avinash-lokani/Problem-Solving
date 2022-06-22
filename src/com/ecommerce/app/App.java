package com.ecommerce.app;

import com.ecommerce.app.crudOp.AddProduct;
import com.ecommerce.app.crudOp.cart;
import com.ecommerce.app.product.Product;

import java.util.*;


public class App {
    private static List<Product> products = new ArrayList<>();

    public static void main(String[] args){
        char repeat = 'n';

        products.add(new Product(1L, "book",102,10));
        products.add(new Product(2L, "chair",2000,10));
        products.add(new Product(3L, "table",213,10));
        products.add(new Product(4L, "pen",23,10));

        System.out.println(products);

        do{
            Scanner sc = new Scanner(System.in);

            System.out.println("to add any product -- press 1");
            System.out.println("to buy any product -- press 2");
            System.out.println("want to stop running press y/Y");
            repeat = sc.next().charAt(0);
            if(repeat == '1'){
                System.out.println("Give the Name of the product");
                String productName = sc.next();


                System.out.println("Give the price of the product");
                int price = sc.nextInt();

                System.out.println("Give the quantity of product");
                int qty = sc.nextInt();

                AddProduct product = new AddProduct();
                product.addProduct(productName,price,qty);
            }
            else if(repeat == '2') {
                do{
                    System.out.println("select the id to add the product to cart");
                    Long id = sc.nextLong();
                    cart cart = new cart();
                    cart.addProductToCart(id,products);
                    System.out.println("to delete the product from cart press delete");
                    String str = sc.next().toLowerCase();
                    if(str.equals("delete")){
                        System.out.println("select the id to delete the product from cart");
                        id = sc.nextLong();
                        cart.deleteProductInCart(id);
                    }
                    System.out.println("if you want to buy the cart type buy");
                    str = sc.next().toLowerCase();
                    if(str.equals("buy")){
                        cart.buyCart();
                    }
                    System.out.println("to add/delete more products Continue press y/y");
                    char flag = sc.next().charAt(0);
                    if(flag != 'y' || flag != 'Y'){
                        break;
                    }
                }while(true);
            }
            else if(repeat == 'y' || repeat == 'Y'){
                break;
            }
            else{
                continue;
            }
        }while(true);
    }

    public static List<Product> getProducts() {
        return products;
    }

    public static void setProducts(List<Product> products) {
        App.products = products;
    }
}
