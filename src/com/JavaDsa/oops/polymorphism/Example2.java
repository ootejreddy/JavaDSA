package com.JavaDsa.oops.polymorphism;

import java.awt.dnd.DropTargetAdapter;

class Animal{
    public void eat(){
        System.out.println("Anmalls eats meet");
    }
    public void sleeps(){
        System.out.println("Animals sleeps as well!");
    }
}

class Tiger extends Animal{
    public void eat() {
        System.out.println("Tiger hunts and eat the food!");
    }
    public void sleep(){
        System.out.println("Tiger eats and takes a nap");
    }
}

class Deer extends Animal{
    public void eat() {
        System.out.println("Deer grazes the food!");
    }
    public void sleep(){
        System.out.println("Deer eats and takes a nap");
    }
}

class AnimalBehaviour{
    public void display(Animal a){
        a.eat();
        a.sleeps();
    }
}

public class Example2 {
    public static void main(String[] args) {
        Tiger roar = new Tiger();
        Deer fast = new Deer();
        AnimalBehaviour AB = new AnimalBehaviour();
        AB.display(roar);
        AB.display(fast);
    }
}
