package org.example.lab1;
import java.awt.*;
public class Automobile<E extends Engine> implements Movable {
    private double currentSpeed;
    private double currentRotation;
    private double xPos;
    private double yPos;
    private E engine;
    private Color color;
    private int nrDoors;
    private String modelName;

    public Automobile(Color color, String modelName, E engine , int nrDoors) {
        this.color = color;
        this.modelName = modelName;
        this.engine = engine;
        this.nrDoors = nrDoors;
    }

    public double getCurrentSpeed() {
        return currentSpeed;
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

    public E getEngine() {
        return engine;
    }

    public Color getColor() {
        return color;
    }

    public int getNrDoors() {
        return nrDoors;
    }

    public String getModelName() {
        return modelName;
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