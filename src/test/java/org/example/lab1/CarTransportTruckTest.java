package org.example.lab1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static java.awt.Color.black;
import static java.awt.Color.gray;
import static org.junit.jupiter.api.Assertions.*;

class CarTransportTruckTest {
    @Test
    @DisplayName("Check that the tranport truck can load a finite amount of cars")
    public void finiteCars() {
        CarTransportTruck<StorableCar> myTransportTruck = new CarTransportTruck<>(gray, 1500);
        Volvo240 myVolvo = new Volvo240(black, 211);
        myTransportTruck.lowerRamp();
        for (int i = 0; i < 20; i++) {
            myTransportTruck.loadCar(myVolvo);
        }
        assertEquals(10, myTransportTruck.getCars().size());
    }

    @Test
    @DisplayName("Check that you can not add a car that is too far away")
    public void addCarFarAway() {
        CarTransportTruck<StorableCar> myTransportTruck = new CarTransportTruck<>(gray, 1500);
        Volvo240 myVolvo = new Volvo240(black, 211);
        myVolvo.startEngine();
        myVolvo.gas(1);
        myVolvo.turnRight();
        myVolvo.turnRight();
        for (int i = 0; i < 100; i++) {
            myVolvo.move();
        }
        System.out.println(myVolvo.getxPos());
        myTransportTruck.lowerRamp();
        myTransportTruck.loadCar(myVolvo);
        assertEquals(0, myTransportTruck.getCars().size());
    }

}