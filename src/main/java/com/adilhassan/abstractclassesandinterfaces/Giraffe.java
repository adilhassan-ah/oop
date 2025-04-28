package com.adilhassan.abstractclassesandinterfaces;

public class Giraffe extends Animal {
    public Giraffe(int age) {
        super(age);
    }

    @Override
    public void makeSound() {
        System.out.println("giraffe hums");
    }
}
