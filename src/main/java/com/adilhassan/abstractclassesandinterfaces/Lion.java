package com.adilhassan.abstractclassesandinterfaces;

public class Lion extends Animal implements Swimable {

    public Lion(int age) {
        super(age);
    }

    @Override
    public void makeSound() {
        System.out.println("lion roars");
    }

    @Override
    public void swim() {
        System.out.println("lion is swimming");
    }
}
