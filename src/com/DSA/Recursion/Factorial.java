package com.DSA.Recursion;
import java.util.*;
import java.io.*;

public class Factorial {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number to find it's factorial: \n");
        int n = input.nextInt();
        int result = factorial(n);
        System.out.println(result);

    }
    static int factorial(int n){
        if(n<2){
            return 1;
        }
        System.out.println(n);
        return n* factorial(n-1);
    }
}
