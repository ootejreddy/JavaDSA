package com.JavaDsa.oops.Interfaces.carExample;

public class carBrake implements Brake{

    @Override
    public void stop() {
        System.out.println("stopped the car after applying break");
    }
}
