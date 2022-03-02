package com.JavaDsa.oops.Interfaces.carExample;

public class powerEngine implements Engine{


    @Override
    public void start() {
        System.out.println("engine has started");
    }

    @Override
    public void stop() {
        System.out.println("engine has stopped");
    }

    @Override
    public void accelerate() {
        System.out.println("car accelerated");
    }
}
