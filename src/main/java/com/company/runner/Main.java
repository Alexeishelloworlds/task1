package com.company.runner;

import com.company.car.Car;
import com.company.engine.Diesel;
import com.company.engine.Electric;
import com.company.engine.Petrol;

public class Main {

    public static void main(String[] args) {

        Petrol petrol = new Petrol(4700, 258);
        Diesel diesel = new Diesel(1398, 70);
        Electric electric = new Electric(90, 423);

        Car Mercedes = new Car("Mercedes S-Klasse", "black", petrol);
        Car Pegeout = new Car("Pegeout 207", "red", diesel);
        Car Tesla = new Car("Tesla Model X 100D", "white", electric);

        Mercedes.go();
        Pegeout.go();
        Tesla.go();

        Mercedes.stop();
        Pegeout.stop();
        Tesla.stop();

    }
}