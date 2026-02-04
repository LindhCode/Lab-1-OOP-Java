package org.example.lab1;
import java.awt.*;

public class Truck extends Automobile implements hasFlatbed, Movable{
    private int flatbedAngle = 0;

    public Truck(Color color, String modelName, Engine engine, int nrDoors){
        super(color,modelName, engine, nrDoors);
    }

    public int getCurrentAngle() {
        return flatbedAngle;
    }

    // From hasFlatbed
    @Override
    public void liftFlatbed(){
        if (currentSpeed != 0 ) {
            System.out.println("Cannot lift the flatbed while the engine is on");
        }
        else{
            flatbedAngle += 10;
            if (flatbedAngle> 70){
                flatbedAngle = 70;
            }
        }
    }


    @Override
    public void lowerFlatbed(){
        if (currentSpeed != 0 ) {
            System.out.println("Cannot lower the flatbed while the engine is on!");
        }
        else{
            flatbedAngle -= 10;
            if (flatbedAngle< 0){
                flatbedAngle = 0;
            }
        }
    }

    // From Movable
    @Override
    public void move(){
        if (flatbedAngle != 0){
            xPos = xPos;
            yPos = yPos;
            System.out.println("Cannot move while flatbed is angled!");
        }
        else {
        xPos += Math.cos(currentRotation) * currentSpeed;
        yPos += Math.sin(currentRotation) * currentSpeed;
        System.out.printf("The car moved to X:%f, Y:%f\n",xPos,yPos);
        }
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
    @Override
    public void gas(double amount) {
        if (flatbedAngle != 0){
            currentSpeed = 0;
            System.out.println("Cant gas while flatbed angled");
        }
        else {
            super.gas(amount);
        }
    }
}
