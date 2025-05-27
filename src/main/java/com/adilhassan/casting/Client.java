package com.adilhassan.casting;

public class Client {
    public static void main(String[] args) {
        //  Animal
        //    ^
        //   /  \
        //Lion   Bat
        Animal animal = new Lion(); // upcating to a superclass
        Lion lion1 = (Lion) animal; // downcasting
        Lion l = new Lion();

        Animal[] animals = new Animal[]{new Lion(), new Bat()};
        for (Animal ani : animals) {
            ani.makeSound();

            if (ani instanceof Lion) {
                Lion l1 =(Lion) ani;
                l1.swim();
            }

            // Bat

            // Tiger
        }
        lion1.swim();

        Swimable swimable = new Lion();     // upcasting to an interface
        Lion lion2 = (Lion) swimable; // downcasting

        cast(animal);

        Animal animal1 = new Animal();
        Lion lion3 = (Lion) animal1; // downcasting - be careful!!!
    }

    public static void cast(Animal animal) {
//        Bat bat1 = (Bat) animal; // downcasting - be careful!!!
        if (animal instanceof Bat) {
            Bat bat2 = (Bat) animal;
            bat2.fly();
        }
        if (animal instanceof Lion) {
            Lion lion = (Lion) animal;
            lion.swim();
        }
    }
}
