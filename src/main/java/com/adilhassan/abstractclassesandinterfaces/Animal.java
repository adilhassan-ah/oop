package com.adilhassan.abstractclassesandinterfaces;

public abstract class Animal {
    private int age;

    public Animal(int age) {
        this.age = age;
    }

    public void eat() {
        System.out.println(this.getClass().getSimpleName() + " is eating");
    }

    public abstract void makeSound();
}
