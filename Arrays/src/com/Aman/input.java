package com.Aman;

import java.util.Arrays;
import java.util.Scanner;

public class input {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        //Array of primitive data
//        int[] arr=new int[5];
//        arr[0]=4;
//        arr[1]=10;
//        arr[2]=20;
//        arr[3]=48;
//        arr[4]=54;
//        System.out.println(arr);
//        System.out.println(arr[4]);

//        for(int i=0;i<arr.length;i++){
//            arr[i]=in.nextInt();
//        }
        //method to print the array elements
//        System.out.println(Arrays.toString(arr));

        //method to print the array elements
//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }

        //Enhanced version to print elements

//        for(int num : arr){//for all element in the array  print the element
//            System.out.print(num+ " ");//here num represents the  element of array
//        }


        //array of objects data
        System.out.println("Enter the string input");
        String[] str=new String[4];
        for(int i=0;i<str.length;i++){
            str[i]=in.next();
        }

        System.out.println(Arrays.toString(str));

        //modify
        str[1]="are";
        System.out.println(Arrays.toString(str));




    }
}
