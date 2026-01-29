package org.example.lab1;

import java.awt.*;

public class Car extends Vehicle implements Movable {
    public int nrDoors;
    public double currentSpeed;
    private double currentRotation = 0;
    private double xPos;
    private double yPos;
    public Engine engine;

    public Car(Color color, String modelName, Engine engine, int nrDoors){
        super(color,modelName);
        this.engine = engine;
        this.nrDoors = nrDoors;
    }

    public double getCurrentSpeed(){
        return currentSpeed;
    }

    public void incrementSpeed(double amount){
        currentSpeed = getCurrentSpeed() + engine.speedFactor() * amount;
    }

    public void startEngine(){
        currentSpeed = 0.1;
    }

    public void stopEngine(){
        currentSpeed = 0;
    }

    public int getNrDoors(){
        return nrDoors;
    }

    public double getCurrentRotation() {
        return currentRotation;
    }

    public double getxPos() {
        return xPos;
    }

    public double getyPos() {
        return yPos;
    }

    @Override
    public void move(){
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
