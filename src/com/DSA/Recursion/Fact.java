package com.DSA.Recursion;

public class Fact {
    public static void main(String[] args) {
        int n=5;
        System.out.println("The factorial is: "+fact(n));
    }
    public static int  fact(int n){
        if(n==1){
            return 1;
        }
        return n*fact(n-1);
    }
}
