package org.example.lab1;

import java.awt.*;

import static java.awt.Color.*;

public class Main {
    static void main(String[] args) {
        Saab95 mySaab = new Saab95(black, 211);
        Volvo240 myVolvo = new Volvo240(black, 211);
        CarTransportTruck<StorableCar> myTransportTruc = new CarTransportTruck<>(gray, 1500);
        myTransportTruc.lowerRamp();
        myTransportTruc.loadCar(myVolvo);
        myTransportTruc.loadCar(mySaab);
        myTransportTruc.liftRamp();
        myTransportTruc.gas(1);
        myTransportTruc.startEngine();
        myTransportTruc.gas(1);
        myTransportTruc.gas(1);
        myTransportTruc.move();
        myTransportTruc.move();
        myTransportTruc.move();
        System.out.println(myTransportTruc.getCurrentSpeed());
        System.out.println(myTransportTruc.getxPos());
        myTransportTruc.stopEngine();
        myTransportTruc.lowerRamp();
        myTransportTruc.unloadCar();
        myTransportTruc.unloadCar();
        System.out.println(mySaab.getxPos());
        System.out.println(myVolvo.getxPos());
        myTransportTruc.unloadCar();
        myTransportTruc.unloadCar();
        myTransportTruc.unloadCar();
//        for (StorableCar c : myTransportTruc.getCars()) {
//            System.out.println(c);
//        }

    }
}