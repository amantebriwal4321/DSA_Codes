package com.aman;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Inputs {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the integer number for input ");
        int num=input.nextInt();
        System.out.println("The number is "+ num);

        input.nextLine(); // consume leftover newline



//        System.out.print("Enter the string input:");
//        String cont2=input.next();
//        System.out.println("The string is " + cont2);
//
//        System.out.print("Enter the string input:");
//        String cont=input.nextLine();
//        System.out.println("The string is " + cont);
//

        System.out.println("Enter the float value");
        float decimal=input.nextFloat();
        System.out.println("The float value is " + decimal);

//        Scanner input = new Scanner(System.in);
//
//        int num1 = input.nextInt();
//        int num2 = input.nextInt();
//
//        int sum= num1+num2;
//
//        System.out.println("The sum of the numbers is "+ sum);
    }
}
