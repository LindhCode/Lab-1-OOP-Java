package org.example.lab1;
import java.awt.*;

public class Truck extends Automobile implements hasFlatbed, Movable{
    private int currentAngle;

    public Truck(Color color, String modelName, Engine engine, int nrDoors){
        super(color,modelName, engine, nrDoors);
    }

    // From hasFlatbed
    public void liftFlatbed(){
        // TODO - Add logic here
    }
    public void lowerFlatbed(){
        // TODO - Add logic here
    }

    // From Movable
    @Override
    public void move(){
        // TODO - Add logic here
        xPos += Math.cos(currentRotation) * currentSpeed;
        yPos += Math.sin(currentRotation) * currentSpeed;
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
