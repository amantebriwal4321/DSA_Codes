package com.aman;

public class Shadowing {
    static int x=90;
    public static void main(String[] args){
        System.out.println(x);//90
        int x;
        x=40;
        System.out.println("Intlizing a vlaue to x here");
        System.out.println(x);//40
        fun();

    }
    static void fun(){
        System.out.println(x);
    }
}
