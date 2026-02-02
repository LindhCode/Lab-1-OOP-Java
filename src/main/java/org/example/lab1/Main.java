package org.example.lab1;

import static java.awt.Color.*;

public class Main {
    static void main(String[] args) {
        Truck minTruck = new Truck(black,"truck",new Engine(700,true),2);
        Scania scania = new Scania(blue);
        minTruck.startEngine();
        minTruck.gas(1);
        System.out.println("Truck objects move()-method: ");
        minTruck.move();

        scania.startEngine();
        scania.gas(0.7);
        System.out.println("Scania objects move()-method: ");
        scania.move();


    }
}
