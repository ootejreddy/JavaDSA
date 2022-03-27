package com.DSA.BinarySearch.InterviewProblems;

import java.util.ArrayList;
import java.util.Scanner;
/*
The problem here is to find the smallest element which greater than the target element
 */
public class CeilingOfANumber {

    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        for(int i=0;i<7;i++){
            arr.add(input.nextInt());
        }
        System.out.println("enter the target element: ");
        int target = input.nextInt();
        int ans = ceiling(arr, target);
        if(ans == -1){
            System.out.println("answer can't be found");
        }
        else {
            System.out.println(" the smallest element greater than target element is: " + ans);
        }
    }

    static int ceiling(ArrayList<Integer> arr, int target){
        int start = 0;
        int end = arr.size()-1;
        if(target > arr.get(end)){
            return -1;
        }
        while(start <= end){
            int middle = start+(end-start)/2;
            if(target == middle){
                return middle;
            }
            if(target > arr.get(middle)){
                start = middle+1;
            }
            if(target < arr.get(middle)){
                end = middle -1;
            }
        }
        return arr.get(start);
    }

}
