package com.adilhassan.abstractclassesandinterfaces;

public class Duck extends Animal implements Flyable, Swimable {
    public Duck(int age) {
        super(age);
    }

    @Override
    public void makeSound() {
        System.out.println("duck quacks");
    }

    @Override
    public void fly() {
        System.out.println("duck is flying");
    }

    @Override
    public void swim() {
        System.out.println("duck is swimming");
    }
}
