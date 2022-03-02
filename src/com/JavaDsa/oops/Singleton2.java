package com.JavaDsa.oops;

public class Singleton2 {
    private Singleton2(){

    }
    private static Singleton2 Instance;
    public static Singleton2 getInstance(){
        if (Instance == null)
        {
            Instance = new Singleton2();
        }
        return Instance;
    }
}
