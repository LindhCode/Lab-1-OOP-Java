package org.example.lab1;

import java.awt.*;

public class Main {
    static void main(String[] args) {
        Car c = new Saab95(Color.black);
        c.gas(1);
        c.brake(1);
        c.incrementSpeed(100);
        c.gas(1);
        c.startEngine();
        c.brake(1);
        c.gas(1);
        c.incrementSpeed(100);
        System.out.println(c.getCurrentSpeed());
    }
}
