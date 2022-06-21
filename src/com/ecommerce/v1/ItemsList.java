package com.ecommerce.v1;

import java.util.Map;

// decomposition - subproblem - ListItems

public class ItemsList {
    static void listOfItems(Map<String, ItemDetails> items) {

        System.out.println("SNo " + "ItemName" +  " " + "price " + "quantity");

        System.out.println("=============================");
        int i = 0;
        for(Map.Entry<String, ItemDetails> itr : items.entrySet()){
            System.out.println( i++  + " " + itr.getKey() + " " +itr.getValue().cost + " " + itr.getValue().qty);
        }

    }
}
