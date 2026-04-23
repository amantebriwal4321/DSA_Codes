package com.aman;

import java.util.Arrays;

public class VariableArguments {
    public static void main(String[] args){
//        fun(2,3,4,34,5,8,432,4,54,3,4,32,8,98);

        various(2,6,"Aman","Shiva");


        demo("Aman","Shiva");
        demo(1,4,6,54,342,82,23,536,95);



    }
    static void demo(String ...v){
        System.out.println("First answer");
        System.out.println(Arrays.toString(v));
    }

    static void demo(int ...v){
        System.out.println("Second Answer");
        System.out.println(Arrays.toString(v));
    }




    static void various(int a, int b, String ...v){
        System.out.println(Arrays.toString(v));
        System.out.println(a);
        System.out.println(b);

    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));

    }
}
