package org.example.lab1;
import java.awt.*;

public class Scania extends Truck{
    public Scania(Color color){
        super(color, "Scania Truck", new Engine(700, true), 2);
    }
}
