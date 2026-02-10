package org.example.lab1;

import java.awt.*;

public class Volvo240 implements StorableCar {
    private Car<RegularEngine> car;

    public Volvo240(Color color, int enginePower) {
        this.car = new Car<RegularEngine>(new Automobile(color, "Saab95", new RegularEngine(enginePower), 5));
    }

    public Car getCar() {
        return car;
    }

    public double getCurrentSpeed() {
        return car.getCurrentSpeed();
    }

    public void brake(double amount) {
        car.brake(amount);
    }

    public void gas(double amount) {
        car.gas(amount);
    }

    public void move() {
        car.move();
    }

    public void turnLeft() {
        car.turnLeft();
    }

    public void turnRight() {
        car.turnRight();
    }

    public void stopEngine() {
        car.stopEngine();
    }

    public void startEngine() {
        car.startEngine();
    }

    public double getxPos() {
        return car.getxPos();
    }

    public double getyPos() {
        return car.getyPos();
    }
}
