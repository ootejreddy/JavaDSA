package com.DSA.LinearSearch;

import java.util.ArrayList;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++){
            arr.add(sc.nextInt());
        }
        for(int ele:arr){
            System.out.println(ele);
        }
        int toSearch = 8;
        System.out.println(searchOf(arr,toSearch));
    }
    static boolean searchOf(ArrayList<Integer> arr, int element){

        if(arr.size() == 0){
            return false;
        }
        for(int ele: arr){
            if(ele == element){
                return true;
            }
        }
        return false;
    }

}
