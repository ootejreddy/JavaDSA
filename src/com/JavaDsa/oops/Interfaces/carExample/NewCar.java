package com.JavaDsa.oops.Interfaces.carExample;

public class NewCar {
    private Engine engine;
    private Media player = new carMedia();
    public NewCar(Engine engine) {
        this.engine = engine;
    }
    public void start(){
        engine.start();
    }
    public void stop(){
        engine.stop();
    }
    public void accelerate(){
        engine.accelerate();
    }
    public void StartMusic(){
        player.start();
    }
    public void stopMusic(){
        player.stop();
    }

}
