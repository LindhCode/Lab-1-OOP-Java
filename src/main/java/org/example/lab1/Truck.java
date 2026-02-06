package org.example.lab1;
import java.awt.*;

public class Truck<E extends Engine>{
    private Automobile<E> automobile;

    public Truck(Automobile<E> automobile){
        this.automobile = automobile;
    }

    public Automobile<E> getAutomobile(){
        return automobile;
    }
}
