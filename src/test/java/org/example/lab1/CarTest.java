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
        double amount = 10;
        c.incrementSpeed(amount);
        assertEquals(10, c.getCurrentSpeed());
    }

    @Test
    void notMovingWhenEngineOff() {
        Car bil = new Car(Color.GREEN, "V70", new Engine(90, true), 4);
        double startX = bil.getxPos();
        double startY = bil.getyPos();

        bil.stopEngine();
        bil.move();
        // Kontrollerar om bilen rör sig när motorn är av från början...
        assertEquals(startX, bil.getxPos());
        assertEquals(startY, bil.getyPos());

        // Kontrollerar om den rör sig om motorn stängs av
        bil.incrementSpeed(10);
        bil.move();
        startX = bil.getxPos();
        startY = bil.getyPos();
        bil.stopEngine();
        bil.move();
        assertEquals(startX, bil.getxPos());
        assertEquals(startY, bil.getyPos());
    }
    void MoveNextKvadrant(Car car){
        for (int i = 0 ; i <6; i++)
            car.turnLeft();}

    double[] updateXY(Car car) {
        MoveNextKvadrant(car);
        car.move();

        double afterX = car.getxPos();
        double afterY = car.getyPos();

        return new double[]{afterX, afterY};
    }


    @Test
    void Turning() {
        Car car = new Car(Color.black, "Volvo", new Engine(100, false),4 );
        car.startEngine();

        double beforeX = car.getxPos();
        double beforeY = car.getyPos();
        for (int i = 0 ; i < 3; i++) {
            car.turnLeft();
        }

        car.incrementSpeed(20);
        car.move();

        double afterX = car.getxPos();
        double afterY = car.getyPos();

        assertTrue(beforeX<afterX);
        assertTrue(beforeY<afterY);
        //första Kvadrant//

        beforeX = afterX;
        beforeY = afterY;

        double[] pos = updateXY(car);
        afterX = pos[0];
        afterY = pos[1];

        assertTrue(beforeX > afterX);
        assertTrue(beforeY < afterY);
        //andra kvadrant//

        beforeX = afterX;
        beforeY = afterY;


        pos = updateXY(car);
        afterX = pos[0];
        afterY = pos[1];

        assertTrue(beforeX > afterX);
        assertTrue(beforeY > afterY);

        //tredje kvadrant//
        beforeX = afterX;
        beforeY = afterY;

        pos = updateXY(car);
        afterX = pos[0];
        afterY = pos[1];

        assertTrue(beforeX < afterX);
        assertTrue(beforeY > afterY);
        //fjärde Kvadrant//

    }

}