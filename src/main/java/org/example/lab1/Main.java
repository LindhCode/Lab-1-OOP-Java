package org.example.lab1;

import java.awt.*;

public class Main {
    static void main(String[] args) {
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