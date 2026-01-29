package org.example.lab1;

import java.awt.*;

public class Saab95 extends Car {
    public Saab95(Color color) {
       super(color, "Saab95", new Engine(200, true), 5);
    }
}