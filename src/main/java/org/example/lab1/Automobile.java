package org.example.lab1;
import java.awt.*;
abstract class Automobile extends Vehicle{
    private int nrDoors;
    protected double currentSpeed;
    protected double currentRotation = 0;
    protected double xPos;
    protected double yPos;
    private Engine engine;

    public Automobile(Color color, String modelName, Engine engine, int nrDoors){
        super(color,modelName);
        this.engine = engine;
        this.nrDoors = nrDoors;
    }

    public Engine getEngine() {
        return engine;
    }

    public double getCurrentSpeed(){
        return currentSpeed;
    }

    public void incrementSpeed(double amount){
        if (currentSpeed != 0) {
            currentSpeed = getCurrentSpeed() + engine.speedFactor() * amount;
            if (currentSpeed < 0.1) {
                currentSpeed = 0.1;
            }
            else if (currentSpeed > engine.getEnginePower()){
                currentSpeed = engine.getEnginePower();
            }
        }
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

    public void gas(double amount) {
        if (amount >= 0 && amount <= 1) {
            incrementSpeed(amount);
        }
    }

    public void brake(double amount) {
        if (amount >= 0 && amount <= 1) {
            incrementSpeed(-amount);
        }
    }

    public double getyPos() {
        return yPos;
    }
}
