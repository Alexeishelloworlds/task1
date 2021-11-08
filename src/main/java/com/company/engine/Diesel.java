package com.company.engine;

public class Diesel extends Engine {
    private double volume;

    public Diesel(double volume, double power){
        super("Дизель", power);
        this.volume=volume;

    }

    @Override
    public void go(){
        System.out.println("Рабочий цикл дизельного двигателя c объемом " + volume +" см^3 и мощностью "+getPower()+" лс");
    }

    @Override
    public void stop(){
        System.out.println("Остановка дизельного двигателя");
    }
}