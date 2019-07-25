package com.ridezum;



public class Main {

    public static void main(String[] args) {

        reverse("algorithm");

    }

    public static void reverse(String random) {

        char[] array = random.toCharArray();
        char temp;
        for (int i = 0; i < array.length/2;i++) {
            temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = temp;

        }

        String result = new String(array);
        System.out.println(result);


    }
}
