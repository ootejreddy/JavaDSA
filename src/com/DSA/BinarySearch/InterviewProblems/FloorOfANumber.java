package com.DSA.BinarySearch.InterviewProblems;

import java.util.ArrayList;
import java.util.Scanner;

public class FloorOfANumber {

    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        for(int i=0;i<7;i++){
            arr.add(input.nextInt());
        }
        int target = input.nextInt();
        int ans = floor(arr, target);
        System.out.println(ans);
    }

    static int floor(ArrayList<Integer> arr, int target){
        int start = 0;
        int end = arr.size()-1;
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
        return arr.get(end);
    }

}
