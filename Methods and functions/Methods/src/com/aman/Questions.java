package com.aman;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
//        int n=in.nextInt();
//        System.out.println("Enter the arm strong number");
//        int num=in.nextInt();


//        boolean ans=isprime(n);
//        System.out.println(ans);


//        boolean armstrong_ans=isarmstrong(num);
//        System.out.println(armstrong_ans);

        for(int i=1;i<1000;i++){
            if(isarmstrong(i)){
                System.out.print(i+" ");
            }
        }
    }
    static boolean isprime(int n){
        if (n<=1){
            return false;
        }
        int c=2;
        while(c*c<=n){
            if (n%c==0){
                return false;
            }
            c++;
        }
        return c*c > n;
    }



    // Print all the three digits armstrong numbers
    static boolean isarmstrong(int num){
        int original=num;
        int sum=0;

        while(num>0){
            int rem=num%10;
            int cube=(rem*rem*rem);
            sum+=cube;
            num=num/10;
        }
        return sum == original;
    }
}
