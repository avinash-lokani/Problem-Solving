package com.ecommerce.v1;

import java.util.Map;
import java.util.Scanner;

//  decomposition - subproblem - AddItem

public class AddItem {
    static void addAnyItem(Map<String, ItemDetails> items) {
        Scanner sc = new Scanner(System.in);

        // same patterns for adding every item

        System.out.println("Give the Name of the item");
        String itemName = sc.next();

        System.out.println("Give the description of the item");
        String description = sc.next();

        System.out.println("Give the price of the item");
        int price = sc.nextInt();

        if(items.containsKey(itemName)){
            items.get(itemName).qty += 1;
            items.put(itemName,items.get(itemName));
        }


        else{
            items.put(itemName,new ItemDetails(description,price,1));
        }


    }

}
