package com.adilhassan.casting;

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
