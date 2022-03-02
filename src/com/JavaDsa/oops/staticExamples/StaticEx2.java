package com.JavaDsa.oops.staticExamples;

public class StaticEx2 {
    static int a=3;
    static int b = 4;
    static {
        System.out.println("This is the static block");
        a = a*5;
    }
    static void add(){
        System.out.println(a+b);
    }
}
