package com.adilhassan.polymorphism;

public class Lion extends Animal implements Swimable {

    @Override
    public void makeSound() {
        System.out.println("lion roars");
    }

    @Override
    public void swim() {
        System.out.println("lion is swimming");
    }
}
