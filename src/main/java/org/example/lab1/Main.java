package org.example.lab1;

import java.awt.*;

import static java.awt.Color.*;

public class Main {
    static void main(String[] args) {
        Saab95 mySaab = new Saab95(black, 211);
        Volvo240 myVolvo = new Volvo240(black, 211);
        mySaab.getCar().getAutomobile().getEngine().setTurboOn();
    }
}