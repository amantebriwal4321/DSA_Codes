package com.aman;

public class FunctionOverloading {
    public static void main(String[] args) {




//        fun(5);
//        fun("Jhon");
        int ans=sum(1,2);
        System.out.println(ans);

        int ans2=sum(1,2,84);
        System.out.println(ans2);

                     }
     static int sum(int a , int b){
         System.out.println("Sum of two numbers");
         return a+b;
     }

    static int sum(int a , int b,int c){
        System.out.println("Sum of three numbers");
        return a+b+c;
    }




//    static void fun(int a){
//        System.out.println(a);
//    }
//
//    static void fun(String n){
//        System.out.println(n);
//
//    }



}
