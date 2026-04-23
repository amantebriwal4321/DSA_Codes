package com.aman;

import java.util.Scanner;

public class CountingOccurence {
    public static void main (String[] args){
        System.out.println("Enter the number from the number is to count");
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        System.out.println("Enter the number to be counted");
        int num=in.nextInt();

        int count=0;

        while(n>0){
            int rem=n%10;
            if (rem==num){
                count++;
            }
            n=n/10;
        }
        System.out.println(count);

    }
}
