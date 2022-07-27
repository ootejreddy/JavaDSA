package com.DSA.Recursion;
import java.lang.*;
import java.util.*;

public class Fibonaccii {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to find the fibonacii");
        int n = 4;
        int result = fibonacii(n);
        System.out.println("result is: "+result);
    }
    static int fibonacii(int n){
        if(n<2){
            return 1;
        }
        return fibonacii(n-1) + fibonacii(n-2);
    }
}
