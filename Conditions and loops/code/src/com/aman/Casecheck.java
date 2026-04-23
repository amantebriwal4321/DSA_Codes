package com.aman;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Casecheck {

    public static void main(String[] args) {
//        String word="Hello";
//        System.out.println(word.charAt(0));//charAt is for the index
//        System.out.println(word.charAt(1));
//        System.out.println(word.charAt(2));
//        System.out.println(word.charAt(3));
//        System.out.println(word.charAt(4));


//        Scanner in= new Scanner(System.in);
//        char ch= in.next().trim().charAt(0);
//        System.out.println(ch) ;

//        int number='a';
//        System.out.println(number);

//        char e='y';
//        char h='b';
//        if(e>'j' && h<'z'){
//            System.out.println(e + "is lower case");
//        }
//        else{
//            System.out.println("alphabet");
//        }

        System.out.println("Enter the input string or character to be checked  ");
        Scanner in= new Scanner(System.in);
        char ch= in.next().trim().charAt(0);

        if (ch>='a' && ch<='z'){
            System.out.println("Lower Case");
        }
        else{
            System.out.println("Upper Case");
        }




    }


}
