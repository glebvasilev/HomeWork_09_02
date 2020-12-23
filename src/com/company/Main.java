package com.company;

import java.util.Arrays;

abstract class MyProgram {
    /*
     *  Class serves for greetings
     */

    public String[] any;

}

class Greeting extends MyProgram {

    public String[] any = {"Hello, World!"};

    public void sayHello() {
        System.out.println(any);
    }
}

public class Main {

    public static void main(String[] args) {
        String[] any = {"Hello, World!"};
        String arr = Arrays.toString(any);
        System.out.println(arr);

        try {
            String ahr = Arrays.toString(any);
            for (int i = 1; i <= any.length; i++)
                System.out.println(any[i]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e + " - caught");
        }
    }
}