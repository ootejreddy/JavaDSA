package com.DSA.LinearSearch;

import java.util.ArrayList;
import java.util.Arrays;

public class FindNoOfEvenDigits {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(899,76,00,89,7));
        int count = 0;
        System.out.println("no of even digits in the list are: "+getCount(arr, count));

    }
    static int getCount(ArrayList<Integer> arr, int count){

        for(int ele: arr){
            int eleCount =0;
            while(ele > 0){
                eleCount ++;
                ele = ele/10;
            }
            if(eleCount %2 == 0){
                count++;
            }
        }
        return count;
    }

}
