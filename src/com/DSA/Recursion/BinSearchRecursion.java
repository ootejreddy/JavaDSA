package com.DSA.Recursion;
import java.util.*;
import java.lang.*;
public class BinSearchRecursion {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("enter the size of an array:\n");
        int n = input.nextInt();
        ArrayList<Integer> arr= new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            int element = input.nextInt();
            arr.add(element);
        }
        System.out.println("enter the target element ot search");
        int target = input.nextInt();
        int result = binSearch(arr,target,0,n-1);
        if(result == -1){
            System.out.println("element not found");
        }
        else {
            System.out.println("element found at: "+result);
        }
    }

    static int binSearch(ArrayList<Integer>arr,int target,int start,int end){

        if(start > end){
            return -1;
        }

        int middle = start+(end-start)/2;
        if(arr.get(middle) == target){
            return middle;
        }
         if(target > arr.get(middle)){
            return binSearch(arr,target,middle+1,end);
        }
            return binSearch(arr,target,start,middle-1);
    }
}
