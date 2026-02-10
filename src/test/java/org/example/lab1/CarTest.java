package org.example.lab1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    @Test
    @DisplayName("Test for the mod operations when turning left and right")
    void turnLeftTurnRight() {
        Car<RegularEngine> c = new Car<>(new Automobile<>(Color.black,"bil",new RegularEngine(200),5, 2));
        // Turn the car 360 + 15 derees
        c.getAutomobile().turnRight();
        assertEquals(345 * Math.PI / 180, c.getAutomobile().getCurrentRotation());
        c.getAutomobile().turnLeft();
        c.getAutomobile().turnLeft();
        assertEquals(15 * Math.PI / 180, c.getAutomobile().getCurrentRotation());
    }

    @Test
    @DisplayName("Test if the speed increments correctly")
    void incrementSpeed() {
        Car<RegularEngine> c = new Car<>(new Automobile<>(Color.black,"bil",new RegularEngine(100),5, 2));
        double amount = 10;
        c.getAutomobile().incrementSpeed(amount);
        assertEquals(0, c.getAutomobile().getCurrentSpeed());
        c.getAutomobile().startEngine();
        c.getAutomobile().incrementSpeed(amount);
        System.out.println(c.getAutomobile().getCurrentSpeed());
        assertEquals(10.1, c.getAutomobile().getCurrentSpeed());
    }

    @Test
    @DisplayName("Test if the car can move in different engine stages")
    void notMovingWhenEngineOff() {
        Car<RegularEngine> bil = new Car<>(new Automobile<>(Color.black,"bil",new RegularEngine(200),5, 2));
        double startX = bil.getAutomobile().getxPos();
        double startY = bil.getAutomobile().getyPos();

        bil.getAutomobile().stopEngine();
        bil.getAutomobile().move();
        // Kontrollerar om bilen rör sig när motorn är av från början...
        assertEquals(startX, bil.getAutomobile().getxPos());
        assertEquals(startY, bil.getAutomobile().getyPos());

        // Kontrollerar om den rör sig om motorn stängs av
        bil.getAutomobile().incrementSpeed(10);
        bil.getAutomobile().move();
        startX = bil.getAutomobile().getxPos();
        startY = bil.getAutomobile().getyPos();
        bil.getAutomobile().stopEngine();
        bil.getAutomobile().move();
        assertEquals(startX, bil.getAutomobile().getxPos());
        assertEquals(startY, bil.getAutomobile().getyPos());
    }

    void MoveNextKvadrant(Car car){
        for (int i = 0 ; i <6; i++)
            car.getAutomobile().turnLeft();}

    double[] updateXY(Car car) {
        MoveNextKvadrant(car);
        car.getAutomobile().move();

        double afterX = car.getAutomobile().getxPos();
        double afterY = car.getAutomobile().getyPos();

        return new double[]{afterX, afterY};
    }

    @Test
    @DisplayName("Test if the x and y coordinates act correctly in different quadrants")
    void Turning() {
       Car<RegularEngine> car = new Car<>(new Automobile<>(Color.black,"bil",new RegularEngine(200),5, 2));
        car.getAutomobile().startEngine();
        double beforeX = car.getAutomobile().getxPos();
        double beforeY = car.getAutomobile().getyPos();
        for (int i = 0 ; i < 3; i++) {
            car.getAutomobile().turnLeft();
        }

        car.getAutomobile().incrementSpeed(20);
        car.getAutomobile().move();

        double afterX = car.getAutomobile().getxPos();
        double afterY = car.getAutomobile().getyPos();

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


    @Test
    @DisplayName("Controls that current speed always less or equal to engine power")
    void SpeedLimit(){
        Car<RegularEngine> car = new Car<>(new Automobile<>(Color.black,"bil",new RegularEngine(200),5, 2));
        car.getAutomobile().startEngine();
        for (int i = 0 ; i <99;i++){
            car.getAutomobile().gas(1);

            assertTrue(car.getAutomobile().getCurrentSpeed() < car.getAutomobile().getEngine().getEnginePower());
        }
    }

    @Test
    @DisplayName("Controls that gas and break only changes within 0-1 range")
    void GasBreakLimit() {
        Car<RegularEngine> car = new Car<>(new Automobile<>(Color.black,"bil",new RegularEngine(200),5, 2));
        car.getAutomobile().startEngine();
        double previousSpeed = car.getAutomobile().getCurrentSpeed();
        car.getAutomobile().gas(1.1);
        assertEquals(previousSpeed, car.getAutomobile().getCurrentSpeed());

        car.getAutomobile().gas(-1);
        assertEquals(previousSpeed,car.getAutomobile().getCurrentSpeed());

        car.getAutomobile().brake(-1);
        assertEquals(previousSpeed,car.getAutomobile().getCurrentSpeed());
        car.getAutomobile().brake(2);
        assertEquals(previousSpeed,car.getAutomobile().getCurrentSpeed());

    }
}