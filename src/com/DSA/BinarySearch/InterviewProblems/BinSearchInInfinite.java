package com.DSA.BinarySearch.InterviewProblems;
/*
    Find position of an element in a sorted array of infinite numbers
    here we don't know the size of array because we are assuming it's an infinite array
    so we followed chunks concept to get the position
 */
public class BinSearchInInfinite {
    public static void main(String[] args){

        int[] arr = {10,11,12,13,14,15,16,17,20,21,45,78,79,80};
        int target = 21;
        int start = 0;
        int end = 1;
        while(target > arr[end]){
            int temp = end+1;
            end = end+(end-start+1)*2;
            start = temp;
        }
         System.out.println(binSearch(arr,target,start,end));
    }

    static int binSearch(int[] arr,int target, int start, int end){
        while(start<=end){
            int middle = start+(end-start)/2;
            if(target > arr[middle]){
                start = middle+1;
            }
            else if(target < arr[middle]){
                end = middle-1;
            }
            else{
                return middle;
            }
        }
        return -1;
    }
}
