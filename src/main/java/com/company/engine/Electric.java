package com.company.engine;

public class Electric extends Engine {
    double batteryCapacity;

    public Electric(double batteryCapacity, double power) {
        super("Электро", power);
        this.batteryCapacity = batteryCapacity;

    }

    @Override
    public void go() {
        System.out.println("Рабочий цикл электродвигателя c емкостью батареи " + batteryCapacity + " квт/ч и мощностью " + getPower() + " лс");
    }

    @Override
    public void stop() {
        System.out.println("Остановка электродвигателя");
    }
}