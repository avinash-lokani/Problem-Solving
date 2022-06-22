package com.ecommerce.app;

import com.ecommerce.app.constants.Constants;
import com.ecommerce.app.model.Cart;
import com.ecommerce.app.product.Product;
import com.ecommerce.app.service.CartService;
import com.ecommerce.app.service.ProductService;

import java.util.*;

public class App {
    private static List<Product> products = new ArrayList<>();
    static{
        products.add(new Product(1L, "book",102,10));
        products.add(new Product(2L, "chair",2000,10));
        products.add(new Product(3L, "table",213,10));
        products.add(new Product(4L, "pen",23,10));

    }
    private static Constants constants = new Constants();

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char repeat = 'n';
        do{
            System.out.println(products);


            System.out.println(constants.addProduct);
            System.out.println(constants.buyProduct);
            System.out.println(constants.stopProcess);
            repeat = sc.next().charAt(0);
            if(repeat == '1'){
                System.out.println(constants.name);
                String productName = sc.next();

                System.out.println(constants.price);
                int price = sc.nextInt();

                System.out.println(constants.quantity);
                int qty = sc.nextInt();

                ProductService productService = new ProductService();
                productService.addProduct(new Product(productName,price,qty));
            }
            else if(repeat == '2') {
                CartService cartService = new CartService();
                do{
                    System.out.println(constants.add);
                    String str = sc.next().toLowerCase();
                    if(str.equals("add")) {
                        System.out.println(constants.addToCart);
                        Long id = sc.nextLong();
                        cartService.addProduct(id);
                    }
                    else if(str.equals("delete")){
                        System.out.println(constants.deleteCart);
                        Long id = sc.nextLong();
                        cartService.deleteProduct(id);
                    }
                    else if(str.equals("buy")){
                        cartService.checkOut();
                    }
                    System.out.println(constants.stopProcess);
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
