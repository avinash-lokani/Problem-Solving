package com.ecommerce.v1;

import java.util.HashMap;
import java.util.Map;

public class Items {
    public Map<String,ItemDetails> getItems(){

        Map<String,ItemDetails> itemsMap = new HashMap<>();

        itemsMap.put("book",new ItemDetails("book",20,10));
        itemsMap.put("chair",new ItemDetails("chair",102,20));
        itemsMap.put("pencil",new ItemDetails("pencil",5,1000));
        itemsMap.put("box",new ItemDetails("box",43,342));

        return itemsMap;
    }
}
