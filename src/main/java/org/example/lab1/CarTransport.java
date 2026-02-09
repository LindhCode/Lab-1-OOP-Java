package org.example.lab1;

public class CarTransport extends Trailer{
    private boolean rampUp = true;

    public CarTransport(double trailerLength) {
        super(trailerLength);
    }

    public void lowerRamp(){
        rampUp = false;
    }

    public void liftRamp(){
        rampUp = true;
    }

    public boolean isRampUp() {
        return rampUp;
    }

    // TODO - Lägg in logik för rampen och att lasta bilar osv...
}
