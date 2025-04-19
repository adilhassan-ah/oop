package com.adilhassan.methodoverloadingoverridinghiding;

public class Client {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.m1();
        vehicle.m2("A");
        vehicle.m3();

        System.out.println("---");

        Car car = new Car();
        car.m1();
        car.m2("B");
        car.m3();

        System.out.println("---");

        Vehicle vehicle1 = new Car();
        vehicle1.m1();
        vehicle1.m2("C");
        vehicle1.m3();
    }
}
