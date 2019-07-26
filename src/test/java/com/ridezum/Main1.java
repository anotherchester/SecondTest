package com.ridezum;

import java.util.ArrayList;

public class Main1 {

    public static void main(String[] args){

        ArrayList<String> array = new ArrayList<String>();

        array.add(0,"Help me");
        array.add(1,"aaa");
        array.add(2,"Test");
        array.add(3,"Don't forget to extend insurance");
        array.add(4,"0987654321");

        /*for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }*/

        for (String element:array) {
            System.out.println(element);
        }


    }
}
