package org.example.lab1;

public class Truck<E extends Engine> implements StorableTruck {
    private Automobile<E> automobile;

    public Truck(Automobile<E> automobile){
        this.automobile = automobile;
    }

    public void move(){
        this.getAutomobile().move();
    }

    public void gas(double amount){
        this.getAutomobile().gas(amount);
    }

    public void brake(double amount){
        this.getAutomobile().brake(amount);
    }

    public void turnLeft(){
        this.getAutomobile().turnLeft();
    }

    public void turnRight(){
        this.getAutomobile().turnRight();
    }

    public void startEngine(){
        this.getAutomobile().startEngine();
    }

    public void stopEngine(){
        this.getAutomobile().stopEngine();
    }

    public Automobile<E> getAutomobile() {
        return automobile;
    }

    public double getxPos() {
        return automobile.getxPos();
    }

    public double getyPos() {
        return automobile.getyPos();
    }
}
