package com.JavaDsa.oops.Interfaces.carExample;

public class ElectricEngine implements Engine{

    @Override
    public void start() {
        System.out.println("Electric Engine starts");
    }

    @Override
    public void stop() {
        System.out.println("Electric engine stops");
    }

    @Override
    public void accelerate() {
        System.out.println("Electric engine accelerates");

    }

}
