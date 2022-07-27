package com.DSA.Recursion;
import java.util.*;
import java.io.*;

public class PrintingNumsReverse {

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n = input.nextInt();
        printNum(n);
    }
    static void printNum(int n){
        if(n == 0){
            return;
        }

        printNum(n - 1);
        System.out.print(n);
    }

}
