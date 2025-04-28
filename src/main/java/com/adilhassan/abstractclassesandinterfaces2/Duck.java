package com.adilhassan.abstractclassesandinterfaces2;

public class Duck extends Animal {
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
