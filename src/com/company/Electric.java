package com.company;

public class Electric extends Engine {
    double batteryCapacity;//Емкость батареи, квт/ч

    public Electric(double batteryCapacity, double power){
        // !!! мощность можно рассчитать по переданным в конструктор параметрам(полям) двигателя
        // для простоты я ее сразу прописал, просто надо разбираться как ее считать правильно
        super("Электро", power);
        this.batteryCapacity=batteryCapacity;

    }

    @Override
    public void go(){
        System.out.println("Рабочий цикл электродвигателя c емкостью батареи " + batteryCapacity +" квт/ч и мощностью "+getPower()+" лс");
    }

    @Override
    public void stop(){
        System.out.println("Остановка электродвигателя");
    }
}
