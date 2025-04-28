package com.adilhassan.abstractclassesandinterfaces2;

public class Client {
    public static void main(String[] args) {

        Animal[] animals = {new Bat(2), new Duck(5), new Giraffe(3), new Lion(6)};

        for (Animal animal : animals) {
            animal.eat();
            animal.makeSound();
            animal.fly();
            animal.swim();

            System.out.println("------------------");
        }
    }
}
