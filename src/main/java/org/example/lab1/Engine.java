package org.example.lab1;

public class Engine {
    private int enginePower;
    private boolean hasTurbo;
    private boolean turboOn;

    public Engine(int enginePower, boolean hasTurbo) {
        this.enginePower = enginePower;
        this.hasTurbo = hasTurbo;
    }

    public void setTurboOn(){
        turboOn = (hasTurbo == true) ? true:false;
    }

    public void setTurboOff(){
        turboOn = false;
    }

    public double speedFactor(){
        double turbo = 1;
        if (turboOn) turbo = 1.3;
        return enginePower * 0.01 * turbo;
    }

    public double getEnginePower(){
        return enginePower;
    }

    public boolean isTurboOn() {
        return turboOn;
    }
}
