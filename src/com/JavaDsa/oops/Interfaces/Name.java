package com.JavaDsa.oops.Interfaces;

public class Name implements Example1 {

    String Name;
    public Name(String name){
        this.Name = name;
    }

    @Override

    public void getName() {
        System.out.println(Name);
    }

    @Override
    public void PutName(String name) {
        Name = name;
        System.out.println(Name);
    }

}
