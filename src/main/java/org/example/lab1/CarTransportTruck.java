package org.example.lab1;

import java.awt.*;

public class CarTransportTruck {
    Truck<TurboEngine> truck;
    CarTransport trailer;

    public CarTransportTruck(Color color, int enginePower){
        this.truck = new Truck<>(new Automobile<>(color, "CarTransportTruck", new TurboEngine(enginePower),2));
    }

    public void liftRamp(){
        if(truck.getAutomobile().getCurrentSpeed() == 0){
            //trailer.liftRamp()
        }
    }

    public void lowerRamp(){
        if(truck.getAutomobile().getCurrentSpeed() == 0){
            //trailer.lowerRamp()
        }
    }

    public void move(){
        if (trailer.isRampUp()){
            truck.move();
        }
    }
    public void gas(double amount){
        if (trailer.isRampUp()){
            truck.gas(amount);
        }
    }

    public void brake(double amount){
        if (trailer.isRampUp()){
            truck.brake(amount);
        }
    }

    public void turnLeft(){
        truck.turnLeft();
    }

    public void turnRight(){
        truck.turnRight();
    }

}
