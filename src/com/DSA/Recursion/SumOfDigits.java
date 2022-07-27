package com.DSA.Recursion;
import java.util.*;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number:");
        int n = input.nextInt();

        int result =  getResult(n);
        System.out.println(result);
    }
    static int getResult(int n){
        if(n == 0){
            return 0;
        }
        return n%10 + getResult(n/10);
    }
}
