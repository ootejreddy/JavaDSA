package com.DSA.BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class AgnosticBinSearch {
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        int element = input.nextInt();
        for(int i=0;i<5;i++){
            arr.add(input.nextInt());
        }
        System.out.println(arr);
        System.out.println(Search(arr, element));
    }

    static int Search(ArrayList<Integer> arr, int element){
        boolean isAsc;
        int start = 0;
        int end = arr.size()-1;
        if(arr.get(start)< arr.get(end)){
            isAsc = true;
        }
        else{
            isAsc = false;
        }
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr.get(mid) == element){
                return mid;
            }
            if(isAsc){
                if(element > arr.get(mid)){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
            else{
                if(element > arr.get(mid)){
                    end = mid -1 ;
                }
                else{
                    start = mid+1;
                }
            }
        }
        return -1;
    }

}
