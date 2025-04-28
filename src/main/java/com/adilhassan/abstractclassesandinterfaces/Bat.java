package com.adilhassan.abstractclassesandinterfaces;

public class Bat extends Animal implements Flyable {
    public Bat(int age) {
        super(age);
    }

    @Override
    public void makeSound() {
        System.out.println("bat chirps");
    }

    @Override
    public void fly() {
        System.out.println("bat is flying at night");
    }
}
