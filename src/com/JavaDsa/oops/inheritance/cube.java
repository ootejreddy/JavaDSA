package com.JavaDsa.oops.inheritance;

import jdk.nashorn.internal.objects.annotations.Getter;
import sun.java2d.loops.GeneralRenderer;

public class cube extends Box{
    public cube(double side){
        this.l = side;
        this.h = side;
        this.w = side;
    }
//    @Override
//    void Print(){
//        System.out.println("This is overrided print");
//    }
    double PrintCube(){
        return l*h*w;
    }
}
