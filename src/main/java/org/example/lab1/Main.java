package org.example.lab1;

import java.awt.*;

import static java.awt.Color.*;

public class Main {
    static void main(String[] args) {
        Saab95 mySaab = new Saab95(black, 211);
        Volvo240 myVolvo = new Volvo240(black, 211);
        CarTransportTruck<Saab95> myTransportTruc = new CarTransportTruck<>(gray, 1500);
        myTransportTruc.lowerRamp();
        myTransportTruc.loadCar(mySaab);
        myTransportTruc.loadCar(mySaab);
        myTransportTruc.loadCar(mySaab);
        myTransportTruc.loadCar(mySaab);
        myTransportTruc.loadCar(mySaab);
        myTransportTruc.loadCar(mySaab);
        myTransportTruc.loadCar(mySaab);
        myTransportTruc.loadCar(mySaab);
        myTransportTruc.loadCar(mySaab);
        myTransportTruc.loadCar(mySaab);
        myTransportTruc.loadCar(mySaab);
        myTransportTruc.loadCar(mySaab);
        myTransportTruc.loadCar(mySaab);
        myTransportTruc.loadCar(mySaab);
        myTransportTruc.loadCar(mySaab);
        myTransportTruc.loadCar(mySaab);
        myTransportTruc.loadCar(mySaab);
        myTransportTruc.loadCar(mySaab);
        myTransportTruc.loadCar(mySaab);

        Saab95 newSaab = myTransportTruc.unloadCar();
        myTransportTruc.unloadCar();
        myTransportTruc.unloadCar();
        myTransportTruc.unloadCar();
        myTransportTruc.unloadCar();
        myTransportTruc.unloadCar();
        for (StorableCar c : myTransportTruc.getCars()) {
            System.out.println(c);
        }

    }
}