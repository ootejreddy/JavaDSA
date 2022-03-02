package com.JavaDsa.oops;

public class Main {
    public static void main(String[] args) {
        Singleton obj = Singleton.getInstance();
        System.out.println("object created");
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();
        Singleton2 obj5 = Singleton2.getInstance();
        System.out.println("Singleton2 Object created ");
    }
    }

