package com.aman;
import java.util.Scanner;
public class TypeCasting {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
//        int num=input.nextInt();
//        System.out.println(num);

//        int num=(int)(46.52f);
//        System.out.println(num);
//
//        int num=9;
//        byte b= (byte)(num);// 259 % 256(byte size)=3
//        System.out.println(b);


//        byte a= 20;
//        byte b=40;
//        byte c = 100;
//        int d= a*b/c;
//        System.out.println(d);
//
//          byte a= 20;
//          a=a*5;

//        int num='a';
//        System.out.println(num);

        //Exaple
        byte b= 30;
        char c='h';
        short s=2853;
        int i =3541;
        float f =32.84f;
        double d= 3.8342;
        double expression=(f*b)+(i/c)-(d+s);
        //float+int-double=double
        System.out.println((f*b)+ " " +(i/c)+ " " +(d+s));;;
        System.out.println(expression);


     }
}
