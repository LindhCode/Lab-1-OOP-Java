package org.example.lab1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.security.KeyStore;

import static org.junit.jupiter.api.Assertions.*;
/*
class TruckTest {
    @Test
    @DisplayName("Test if a truck behaves correctly in different flatbed stages")
    public void flatBed() {
        Truck t = new Truck(Color.white, "test truc", new Engine(2000, true), 2);
        // The flatbed should not be rotatable when truck is moving
        t.startEngine();
        t.gas(1);
        t.liftFlatbed();
        assertEquals(0, t.getCurrentAngle());
        // The flatbeed should rotate a maximum of 70 degrees
        t.stopEngine();
        for (int i = 0; i < 15; i++) {
            t.liftFlatbed();
        }
        System.out.println(t.getCurrentAngle());
        assertEquals(70, t.getCurrentAngle());
        // The truck should not move when flatbed is rotated
        t.startEngine();
        t.gas(1);
        assertEquals(0, t.getCurrentSpeed());
    }
}


 */