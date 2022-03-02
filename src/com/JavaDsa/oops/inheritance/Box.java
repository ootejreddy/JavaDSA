package com.JavaDsa.oops.inheritance;

public class Box {
    double l;
    double h;
    double w;
    Box(){
        this.h = -1;
        this.l = -1;
        this.w = -1;
    }
    Box(double l, double h, double w){
        this.l = l;
        this.h = h;
        this.w = w;
    }
    void Print(){
        System.out.println(l+","+h+","+w);
    }
}