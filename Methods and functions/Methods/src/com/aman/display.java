package com.aman;

import java.util.Scanner;

public class display {
    public static void main(String[] args){
        display();
        display();


        Scanner in =new Scanner(System.in);
        System.out.println("Enter your name ");
        String naam=in.nextLine();

        String personalized=Mygreet(naam);
        System.out.println(personalized);
    }
//Using parameters
     static String Mygreet(String name) {
        String message="Hello "+ name;
        return message;
    }

    static void display(){
        System.out.println("Hello World");
    }
}
