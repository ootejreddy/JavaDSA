package com.JavaDsa.oops.Interfaces.carExample;

public class Main {
    public static void main(String[] args) {
        Engine ElectricEngine = new ElectricEngine();
        NewCar car = new NewCar(ElectricEngine);
        car.start();
        car.stop();
        car.StartMusic();
        car.stopMusic();
    }
}
