package com.adilhassan.abstractclassesandinterfaces;

public class Aeroplane implements Flyable {
    @Override
    public void fly() {
        System.out.println("Aeroplane is flying at alt of 5000m");
    }
}
