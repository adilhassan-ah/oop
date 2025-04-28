package com.adilhassan.abstractclassesandinterfaces2;

public class Giraffe extends Animal {
    public Giraffe(int age) {
        super(age);
    }

    @Override
    public void makeSound() {
        System.out.println("giraffe hums");
    }

    @Override
    public void fly() {
//        throw new RuntimeException("I can't fly");
        System.out.println("Are you mad? I can't fly!");
    }

    @Override
    public void swim() {
//        throw new RuntimeException("I can't swim");
        System.out.println("Are you mad? I can't swim!");
    }
}
