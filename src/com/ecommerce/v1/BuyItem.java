package com.ecommerce.v1;

import java.util.Map;
import java.util.Scanner;


import static com.ecommerce.v1.Home.cartList;
import static com.ecommerce.v1.Home.cartValue;

// decomposition - subproblem - BuyItem

public class BuyItem {
    static void buyAnyItem(Map<String, ItemDetails> items) {
        Scanner sc = new Scanner(System.in);

        char repeat = 'y';

        do{

            System.out.println("select the itemName to buy the item");
            String name = sc.next();

            if(items.containsKey(name)){

                cartList.add(items.get(name));


                cartValue += items.get(name).cost;
            }



            System.out.println("do you want to stop press n/N");

            repeat = sc.next().charAt(0);

            if(repeat == 'N' || repeat == 'n'){
                break;
            }
        }while(true);

        if(cartValue != 0){
            System.out.println("Generating bill --------");

            System.out.println("items Bought");
            for(int i = 0;i<cartList.size();i++){
                System.out.println(cartList.get(i));
            }

            System.out.println("total cart value = " + cartValue);
        }

    }

}
