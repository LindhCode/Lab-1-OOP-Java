package org.example.lab1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.security.KeyStore;

import static org.junit.jupiter.api.Assertions.*;

class TruckTest {
    @Test
    @DisplayName("Test if a truck behaves correctly in different flatbed stages")
    public void flatBed() {
        Scania t = new Scania(Color.black,2000);

        // The flatbed should not be rotatable when truck is moving
        t.startEngine();
        t.gas(1);
        t.liftFlatbed();
        assertEquals(0 , t.flatbed.getFlatbedAngle());
        // The flatbeed should rotate a maximum of 70 degrees
        t.stopEngine();
        for (int i = 0; i < 15; i++) {
            t.liftFlatbed();
        }
        System.out.println(t.flatbed.getFlatbedAngle());
        assertEquals(70, t.flatbed.getFlatbedAngle());
        // The truck should not move when flatbed is rotated
        t.startEngine();
        t.gas(1);
        assertEquals(0, t.truck.getAutomobile().getCurrentSpeed());
    }
}


