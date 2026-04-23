package com.aman;

public class Example {
    public static void main (String[] args){
       String name="Aman";
        changeName(name);
        System.out.println(name);
        int num1=2;
        int num2=4;
        swap(num1,num2);
        System.out.println(num1+" "+num2);


    }

    static void changeName(String naam) {
         naam="hero";
    }


    static void  swap(int num1,int num2){
        int temp= num1;
        num1=num2;
        num2=temp;
    }
}
