package com.DSA.RecursionArrays;

import com.sun.source.tree.ArrayAccessTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindPostionBasic {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(List.of(1,23,4,7,8,4));
        List<Integer> result = new ArrayList<>();
        int target = 4;
        System.out.println(getPositions(arr,target,0,result));
    }
    public static List<Integer> getPositions(List<Integer> arr, int target, int start, List<Integer> result){
        if(start == arr.size()){
            return result;
        }
        else{
            if(arr.get(start) == target){
                result.add(start);
            }
            return getPositions(arr,target,start+1,result);
        }
    }
}
