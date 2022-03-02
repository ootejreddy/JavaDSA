package com.JavaDsa.oops.Interfaces.carExample;

public class carMedia implements Media{

    @Override
    public void start() {
        System.out.println("started music");
    }

    @Override
    public void stop() {
        System.out.println("stopped music");
    }

    @Override
    public void pause() {
        System.out.println("music paused");
    }
}
