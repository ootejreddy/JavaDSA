package com.DSA.Recursion;
import java.sql.SQLOutput;
import java.util.*;

//import static jdk.nashorn.internal.objects.NativeJSON.str;

public class ReverseAnum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n = input.nextInt();
        int sum = 0;
         int ans=getReverse(n,sum);
        System.out.println(ans);
    }
    static int getReverse(int n,int sum){
        if(n == 0){
            return 0;
        }
        sum = sum*10 + n%10;
        return getReverse(n/10, sum);
    }
}
