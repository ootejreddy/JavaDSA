package com.JavaDsa.oops.staticExamples;
//example that static variables are global variables
public class staticExample1 {
    static int a = 20;
    int b = 20;
    void add(){
        a = a+30;
        b = b+30;
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }
   void subtract(){
        a = a-20;
        b = b-20;
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }
}
