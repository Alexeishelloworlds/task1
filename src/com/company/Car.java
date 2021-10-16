package com.company;

public class Car {
    private String model;
    private String color;
    private Engine engine;

    public Car(String model,String color,Engine engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    public void go(){
        System.out.println(model+","+color+":");
        engine.go();
    }
    public void stop(){
        System.out.println(model+","+color+":");
        engine.stop();
    }
}
