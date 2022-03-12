package com.DSA.BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 34, 67));
        int SearchFor = 34;
        System.out.println(searchOf(arr, SearchFor));

    }

    static int searchOf(ArrayList<Integer> arr, int element) {
        int start = 0;
        int end = arr.size() - 1;
//        System.out.println(arr.size());
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (element > arr.get(mid)) {
                start = mid + 1;
            } else if (element < arr.get(mid)) {
                end = mid - 1;
            } else {
                return mid; //
            }
        }
        return -1;
    }
}