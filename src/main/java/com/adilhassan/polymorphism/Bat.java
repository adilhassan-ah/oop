package com.adilhassan.polymorphism;


public class Bat extends Animal implements Flyable {

    @Override
    public void makeSound() {
        System.out.println("bat chirps");
    }

    @Override
    public void fly() {
        System.out.println("bat is flying at night");
    }
}
