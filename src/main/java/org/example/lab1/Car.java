package org.example.lab1;

public class Car<E extends Engine> implements StorableCar {
    private Automobile<E> automobile;

    public Car(Automobile<E> automobile) {
        this.automobile = automobile;
    }

    public Automobile<E> getAutomobile() {
        return automobile;
    }

    public void startEngine() {
        automobile.startEngine();
    }

    public void stopEngine() {
        automobile.stopEngine();
    }

    public void turnRight() {
        automobile.turnRight();
    }

    public void turnLeft() {
        automobile.turnLeft();
    }

    public void move() {
        automobile.move();
    }

    public void gas(double amount) {
        automobile.gas(amount);
    }

    public void brake(double amount) {
        automobile.brake(amount);
    }

    public double getCurrentSpeed() {
        return automobile.getCurrentSpeed();
    }

    public double getxPos() {
        return automobile.getxPos();
    }

    public double getyPos() {
        return automobile.getyPos();
    }
}
