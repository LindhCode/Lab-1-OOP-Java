package org.example.lab1;

import org.junit.jupiter.api.Test;

import static java.awt.Color.*;
import static org.junit.jupiter.api.Assertions.*;

class EngineTest {
    @Test
    public void turboMethodsUseability() {
        Engine engineWithTurbo = new Engine(100, true);
        Engine engineWithoutTurbo = new Engine(100, false);

        // Testa om turbo kan sättas igång, resp stängas av
        // för motor med turbo.
        engineWithTurbo.setTurboOn();
        assertTrue(engineWithTurbo.isTurboOn());
        engineWithTurbo.setTurboOff();
        assertFalse(engineWithoutTurbo.isTurboOn());

        // Testa om turbo kan sättas igång för en motor
        // utan turbo
        engineWithoutTurbo.setTurboOn();
        assertFalse(engineWithoutTurbo.isTurboOn());
    }

    @Test
    public void speedFactorConsistency() {
        Engine engineWithTurbo = new Engine(100, true);
        Engine engineWithoutTurbo = new Engine(100, false);
        engineWithTurbo.setTurboOn();

        // Testa om speedFactor() är större för motor med turbo
        assertTrue(engineWithTurbo.speedFactor() > engineWithoutTurbo.speedFactor());

        // Testa om speedFactor är 30% större för motor med turbo
        // jämfört med utan turbo
        assertEquals(engineWithTurbo.speedFactor(), engineWithoutTurbo.speedFactor() * 1.3);
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
        Car car = new Car(black, "Volvo", new Engine(100, false),4 );
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
