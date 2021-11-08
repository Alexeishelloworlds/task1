package com.company.engine;

import com.company.engine.Engine;

public class Petrol extends Engine {
    private double volume;

    public Petrol(double volume, double power) {
        super("Бензин", power);
        this.volume = volume;

    }

    @Override
    public void go() {
        System.out.println("Рабочий цикл бензинового двигателя c объемом " + volume + " см^3 и мощностью " + getPower() + " лс");
    }

    @Override
    public void stop() {
        System.out.println("Остановка бензинового двигателя");
    }
}