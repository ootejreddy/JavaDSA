package com.DSA.BinarySearch;

import java.util.ArrayList;
import java.util.Scanner;

public class Practice1 {


    public static void main(String[] args){
        ArrayList<Integer> arr =  new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        for(int i=0;i<5;i++){
            arr.add(input.nextInt());
        }
        System.out.println(arr);
        int target = input.nextInt();

        int result = agnosticBinSearch(arr, target);
        System.out.println(result);

    }
    static int agnosticBinSearch(ArrayList<Integer> arr, int target){
        int start =0;
        boolean asc;
        int end = arr.size()-1;
        if(arr.get(start) > arr.get(end)){
            asc = false;
        }
        else{
            asc = true;
        }
        while(start <= end){
            int middle = start +(end-start)/2;
            if(arr.get(middle) == target){
                return middle;

            }
            if(asc){
                if(target < arr.get(middle)){
                    end = middle-1;
                }
	else{
                    start = middle +1;
                }
            }
            else{
                if(target > arr.get(middle)){
                    end = middle -1 ;
                }
                else{
                    start = middle+1;
                }
            }

        }
        return -1;
    }
}
