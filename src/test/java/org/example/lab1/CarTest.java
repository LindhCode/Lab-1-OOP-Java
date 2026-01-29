package org.example.lab1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    @DisplayName("Test for the mod operations when turning left and right")
    void turnLeftTurnRight() {
        Car c = new Car(Color.BLUE, "test car", new Engine(100, false),5);
        // Turn the car 360 + 15 derees
        c.turnRight();
        assertEquals(345 * Math.PI / 180, c.getCurrentRotation());
        c.turnLeft();
        c.turnLeft();
        assertEquals(15 * Math.PI / 180, c.getCurrentRotation());
    }

    @Test
    @DisplayName("Test if the speed increments correctly")
    void incrementSpeed() {
        Car c = new Car(Color.BLUE, "test car", new Engine(100, false),5);
        // This test is quite trivial due to the simple sum that the incrementspeed calculate
        double amount = 10;
        c.incrementSpeed(amount);
        assertEquals(10, c.getCurrentSpeed());
    }
}