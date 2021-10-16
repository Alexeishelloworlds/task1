package com.company;

public class Engine {
    private String fuel;
    private double power;//лошадиные силы

    public Engine(String fuel, double power){
        this.fuel=fuel;
        this.power=power;
    }

    public double getPower() {
        return power;
    }

    public void go(){
        System.out.println("Абстрактный двигатель работает");
    }

    public void stop(){
        System.out.println("Абстрактный двигатель остановлен");
    }
}
