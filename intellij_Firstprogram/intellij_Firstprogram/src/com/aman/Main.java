package com.aman;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main{
    static void main(String[] args) {
        System.out.println("Hello World");
        System.out.print(1234 + " ");
        System.out.println("5678");
        int a =583_000_000;
        System.out.println(a);

//        Taking Inputs in java
        System.out.println("Enter the input value");
        Scanner input= new Scanner(System.in);
        System.out.println("Here's the input integer " + input.nextInt());

        // Taking input for a string
        System.out.println("Enter the input String");
        Scanner input2 =new Scanner(System.in);
        System.out.println("Here the input line with next()" +  input2.next());
        System.out.println("Here the input line with neextLine() " +  input2.nextLine());
        //if we take only next then it shows the first letter of the  string , to get the whole line nextline() in used


    }

}
