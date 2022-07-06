package com.example.app;

import com.example.app.constants.Constants;

public class Action {

    public void action(String message){
        System.out.println("Action :-");
        if(message.contains("very danger")){
            System.out.println(Constants.LEVEL_3);
        } else if (message.contains("danger")) {
            System.out.println(Constants.LEVEL_2);
        }
        else{
            System.out.println(Constants.LEVEL_1);
        }
    }

}
