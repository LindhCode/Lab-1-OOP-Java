package org.example.lab1;

import java.awt.*;

public class Car extends Automobile implements Movable {

    public Car(Color color, String modelName, Engine engine, int nrDoors){
        super(color,modelName,engine,nrDoors);
    }

    @Override
    public void move(){
        xPos += Math.cos(getCurrentRotation()) * getCurrentSpeed();
        yPos += Math.sin(getCurrentRotation()) * getCurrentSpeed();
        System.out.printf("The car moved to X:%f, Y:%f\n",xPos,yPos);
    }

    @Override
    public void turnLeft(){
        currentRotation += (Math.PI/12);
        currentRotation %= (2*Math.PI);
    }

    @Override
    public void turnRight(){
        double prevRad = currentRotation;
        currentRotation -= (Math.PI/12);
        currentRotation %= (2*Math.PI);
        if (currentRotation < 0 && prevRad >= 0) {
            currentRotation += 2*Math.PI;
        }
    }


}
