package org.example.lab1;

import java.awt.*;

import static java.awt.Color.*;

public class Main {
    static void main(String[] args) {
        Saab95 mySaab = new Saab95(black, 211);
        Volvo240 myVolvo = new Volvo240(black, 211);
        CarTransportTruck<StorableCar> myTransportTruc = new CarTransportTruck<>(gray, 1500);
        CarTransportTruck<StorableCar> myTransportTruck2 = new CarTransportTruck<>(gray, 1500);
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
        myTransportTruc.turnLeft();
        myTransportTruc.move();
        myTransportTruc.move();
        myTransportTruc.move();
        System.out.println(myTransportTruc.getCurrentSpeed());
        System.out.println(myTransportTruc.getxPos());
        for (StorableCar c : myTransportTruc.getCars()) {
            System.out.println(c.getxPos());
            System.out.println(c.getyPos());
        }
//        for (StorableCar c : myTransportTruc.getCars()) {
//            System.out.println(c);
//        }
        System.out.println("--------------------------------");
        MechanicShop<StorableTruck> truckShop = new MechanicShop<>(10,10,10);
        MechanicShop<Scania> scaniaShop = new MechanicShop<>(10,10,10);
        MechanicShop<Storable> automobileShop = new MechanicShop<>(10,10,10);
        Volvo240 volvo = new Volvo240(Color.black,200);
        Scania scania = new Scania(Color.black,2000);
        RegularEngine regEng = new RegularEngine(200);
        automobileShop.addToRepairList(volvo);

        System.out.println(scaniaShop.getObjectsInShop().size());
        scaniaShop.addToRepairList(new Scania(Color.black,200));
        scaniaShop.addToRepairList(new Scania(Color.black,200));
        scaniaShop.addToRepairList(new Scania(Color.black,200));
        scaniaShop.addToRepairList(new Scania(Color.black,200));
        scaniaShop.addToRepairList(new Scania(Color.black,200));
        scaniaShop.addToRepairList(new Scania(Color.black,200));
        scaniaShop.addToRepairList(new Scania(Color.black,200));
        scaniaShop.addToRepairList(new Scania(Color.black,200));
        scaniaShop.addToRepairList(new Scania(Color.black,200));
        scaniaShop.addToRepairList(new Scania(Color.black,200));
        scaniaShop.addToRepairList(new Scania(Color.black,200));
        System.out.println(scaniaShop.getObjectsInShop().size());

        System.out.println(scaniaShop.removeFromRepair(3));
        System.out.println(scaniaShop.getObjectsInShop().size());

    }
}