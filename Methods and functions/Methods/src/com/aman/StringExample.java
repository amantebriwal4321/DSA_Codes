package com.aman;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class StringExample {
    public static void main (String[] args){
        String message=greet();
        System.out.println(message);

        System.out.println("Void function greetings");
        greet2();


        int ans =sum3(2,3);
        System.out.println(ans);
    }

    static String greet(){
        String greetings="Hi how are you";
        return greetings;


    }
    static void greet2(){
        String greetings2="How are you doing these days";
        System.out.println(greetings2);
    }

    //with string with the return type the data gives to program
    //with void with the non-return type data is just displayed to the user

//Using the parameters

    static int sum3(int a, int b){
        System.out.print("The sum using the parametre is: ");
        int sum=a+b;
        return sum;
    }



}

