package com.ecommerce.app;

import com.ecommerce.app.constants.Constants;
import com.ecommerce.app.model.Product;
import com.ecommerce.app.service.CartService;
import com.ecommerce.app.service.ProductService;

import java.util.*;

public class App {
    public static List<Product> products = new ArrayList<>();
    static{
        products.add(new Product(1L, "book",102,10));
        products.add(new Product(2L, "chair",2000,10));
        products.add(new Product(3L, "table",213,10));
        products.add(new Product(4L, "pen",23,10));
    }
    private static Scanner sc = new Scanner(System.in);
    private static CartService cartService = new CartService();
    private static ProductService productService = new ProductService();
    public static void main(String[] args){

        char repeat = 'n';

        do{
            System.out.println(Constants.ADD_PRODUCT);
            System.out.println(Constants.BUY_PRODUCT);
            System.out.println(Constants.TO_SEARCH);
            System.out.println(Constants.ID_SEARCH);
            System.out.println(Constants.STOP_PROCESS);
            System.out.println(products);
            repeat = sc.next().charAt(0);
            switch (repeat){
                case '1':
                    System.out.println(Constants.NAME);
                    String productName = sc.next();
                    System.out.println(Constants.PRICE);
                    int price = sc.nextInt();
                    System.out.println(Constants.QUANTITY);
                    int qty = sc.nextInt();
                    productService.add(new Product(productName,price,qty));
                    break;
                case '2':
                    cart();
                    break;
                case ('y'|'Y'):
                    break;
                case ('3'):
                        System.out.println(Constants.NAME);
                        String name = sc.next();
                        productService.searchByName(name);
                        break;
                case ('4'):
                    System.out.println(Constants.ID);
                    Long id = sc.nextLong();
                    productService.searchById(id);
                    break;
                default:
                    break;
            }
            if(repeat == 'y'|| repeat =='Y')
                break;
        }while(true);
    }

    private static void cart() {
            System.out.println(Constants.ADD);
            String str = sc.next().toLowerCase();
            if(str.equals("add")) {
                System.out.println(Constants.ADD_TO_CART);
                Long id = sc.nextLong();
                cartService.add(id);
            }
            else if(str.equals("delete")){
                System.out.println(Constants.DELETE_CART);
                Long id = sc.nextLong();
                cartService.delete(id);
            }
            else if(str.equals("buy")){
                cartService.checkOut();
            }
    }

}
