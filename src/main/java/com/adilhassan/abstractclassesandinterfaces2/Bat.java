package com.adilhassan.abstractclassesandinterfaces2;

public class Bat extends Animal {
    public Bat(int age) {
        super(age);
    }

    @Override
    public void makeSound() {
        System.out.println("bat chirps");
    }

    @Override
    public void fly() {
        System.out.println("bat is flying");
    }

    @Override
    public void swim() {
//        throw new RuntimeException("I can't swim");
        System.out.println("Are you mad? I can't swim!");
    }
}
