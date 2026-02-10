package org.example.lab1;

import java.awt.*;

public class Saab95 implements StorableCar {
    private Car car;

    public Saab95(Color color, int enginePower) {
        this.car = new Car<TurboEngine>(new Automobile(color, "Saab95", new TurboEngine(enginePower), 5));
    }

    public Car<TurboEngine> getCar() {
        return car;
    }

    public void startEngine() {
        car.startEngine();
    }

    public void stopEngine() {
        car.stopEngine();
    }

    public void turnRight() {
        car.turnRight();
    }

    public void turnLeft() {
        car.turnLeft();
    }

    public void move() {
        car.move();
    }

    public void gas(double amount) {
        car.gas(amount);
    }

    public void brake(double amount) {
        car.brake(amount);
    }

    public double getCurrentSpeed() {
        return car.getCurrentSpeed();
    }

    public double getxPos() {
        return car.getxPos();
    }

    public double getyPos() {
        return car.getyPos();
    }
}