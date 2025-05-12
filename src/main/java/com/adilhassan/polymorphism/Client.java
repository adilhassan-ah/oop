package com.adilhassan.polymorphism;

public class Client {
    public static void main(String[] args) {
        // A Lion has many forms i.e.
        // Lion can be seen as a Lion
        // It can be seen as an Animal
        // And also as a Swimable
        Lion lion = new Lion();
        Animal animalLion = new Lion();
        Swimable swimableLion = new Lion();

        lion.makeSound();
        animalLion.makeSound();
        swimableLion.swim();

        // A Bat has many forms i.e.
        // Bat can be seen as a Bat
        // It can be seen as an Animal
        // And also as a Flyable
        Bat bat = new Bat();
        Animal animalBat = new Bat();
        Flyable flyableBat = new Bat();

        bat.makeSound();
        animalBat.makeSound();
        flyableBat.fly();
    }
}
