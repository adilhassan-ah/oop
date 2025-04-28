package com.adilhassan.abstractclassesandinterfaces;

public class Client {
    public static void main(String[] args) {

        Animal[] animals = {new Bat(2), new Duck(5), new Giraffe(3), new Lion(6)};
        Flyable[] flyables = {new Bat(2), new Aeroplane()};

        for (var flyable : flyables) {
            flyable.fly();
        }
//
//        for (Animal animal : animals) {
//            animal.eat();
//            animal.makeSound();
//
//            if (animal instanceof Swimable) {
//                ((Swimable) animal).swim();
//            }
//
//            if (animal instanceof Flyable) {
//                ((Flyable) animal).fly();
//            }
//
//            System.out.println("------------------");
//        }
    }
}
