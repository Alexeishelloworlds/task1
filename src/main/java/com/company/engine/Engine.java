package com.company.engine;

public abstract class Engine {
    private String fuel;
    private double power;

    public Engine(String fuel, double power){
        this.fuel=fuel;
        this.power=power;
    }

    public double getPower() {
        return power;
    }

    public abstract void go();

    public abstract void stop();
}
