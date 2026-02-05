package org.example.lab1;

import java.awt.*;

public class Saab95 {
    private Car car;

    public Saab95(Color color, int enginePower) {
        this.car = new Car<TurboEngine>(new Automobile(color, "Saab95", new TurboEngine(enginePower), 5));
    }

    public Car<TurboEngine> getCar() {
        return car;
    }
}