package com.adilhassan.abstractclassesandinterfaces2;

public class Lion extends Animal {

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

    @Override
    public void fly() {
//        throw new RuntimeException("I can't fly");
        System.out.println("Are you mad? I can't fly!");
    }
}
