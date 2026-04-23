package com.aman;

import java.security.spec.RSAOtherPrimeInfo;

import static java.lang.Long.sum;

public class Functions {
    public void main(String[] args) {
        int a= 10;
        int b=20;
        System.out.println("initial value for a: "+a);
        int ans=sum(a,b);
        System.out.println("Sum");

        System.out.println(ans);

        {
            a = 100;//A is not initlized
            System.out.println("Value changed");

            System.out.println(a);
        }
        System.out.println("Changed value of a");
        System.out.println(a);


        System.out.println("Multiplication with the changed value");
        int sol=mul(a,b);
        System.out.println(sol);

    }

    static int sum(int a,int b) {
        int sum = a + b;
        return sum;
    }

    static int mul(int a, int b){
        int multiply=a*b;
        return multiply;
    }

        //Block scope


}
