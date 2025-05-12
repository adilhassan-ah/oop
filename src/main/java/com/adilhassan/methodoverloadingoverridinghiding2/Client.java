package com.adilhassan.methodoverloadingoverridinghiding2;

public class Client {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Car();
        callMethod(vehicle1);
    }

    public static void callMethod(Vehicle vehicle) {
        try {
            vehicle.m1();
        } catch (ChildException e) {
            // ...
            // ..
        }
        try {
            vehicle.m2("A");
        } catch (ChildException e) {
            // ...
        }
    }
}
