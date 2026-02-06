package org.example.lab1;

import java.awt.*;

public class Volvo240 {
    private Car<RegularEngine> car;

    public Volvo240(Color color, int enginePower) {
        this.car = new Car<RegularEngine>(new Automobile(color, "Saab95", new RegularEngine(enginePower), 5));
    }

    public Car getCar() {
        return car;
    }
}
