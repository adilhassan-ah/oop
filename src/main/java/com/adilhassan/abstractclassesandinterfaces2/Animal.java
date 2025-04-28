package com.adilhassan.abstractclassesandinterfaces2;

public abstract class Animal {
    private int age;

    public Animal(int age) {
        this.age = age;
    }

    public void eat() {
        System.out.println(this.getClass().getSimpleName() + " is eating");
    }

    public abstract void makeSound();

    public abstract void fly();

    public abstract void swim();
}
