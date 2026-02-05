package org.example.lab1;

import java.awt.*;

public class Car<E extends Engine> {
    private Automobile<E> automobile;

    public Car(Automobile<E> automobile) {
        this.automobile = automobile;
    }

    public Automobile<E> getAutomobile() {
        return automobile;
    }
}
