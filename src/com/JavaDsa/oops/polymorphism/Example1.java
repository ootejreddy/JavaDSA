package com.JavaDsa.oops.polymorphism;

class Telusko{
    public static void display(){
        System.out.println("Hi telusko");
    }
}
class Alien extends Telusko{
    public static void display(){
        System.out.println("Hi Alien");
    }
}

public class Example1 {
    public static void main(String[] args) {
       Telusko.display();
       Alien.display();
    }
}
