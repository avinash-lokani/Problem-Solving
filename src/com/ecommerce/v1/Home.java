package com.ecommerce.v1;

import java.util.*;

import static com.ecommerce.v1.AddItem.addAnyItem;
import static com.ecommerce.v1.BuyItem.buyAnyItem;
import static com.ecommerce.v1.ItemsList.listOfItems;

public class Home {

    static int cartValue = 0;
    static List<ItemDetails> cartList = new ArrayList<>();

    public static void main(String[] args){
        char repeat = 'n';

        Items itemObj = new Items();
        Map<String,ItemDetails> items = itemObj.getItems();

        do{
            Scanner sc = new Scanner(System.in);

            listOfItems(items);



            System.out.println("to add any item -- press 1");
            System.out.println("to buy any item -- press 2");
            System.out.println("want to stop running press y/Y");
            repeat = sc.next().charAt(0);
            if(repeat == '1'){
                addAnyItem(items);
            }
            else if(repeat == '2') {

                buyAnyItem(items);
            }
            else if(repeat == 'y' || repeat == 'Y'){
                break;
            }
            else{
                continue;
            }

        }while(true);

    }
}
