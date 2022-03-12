package com.DSA.LinearSearch;

public class LinearSearchInString {
    public static void main(String[] args) {
        String name = "Saiootej";
        char target = 'o';
        System.out.println(searchOf(name,target));
    }
    static boolean searchOf(String name, char target){
        for(char ele: name.toCharArray()){
            if(target == ele){
                return true;
            }
        }
        return false;
    }

}
