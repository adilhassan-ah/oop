package com.adilhassan.methodoverloadingoverridinghiding2;

public class Vehicle {

    public void m1() throws ChildException {
        System.out.println("Vehicle m1");
    }

    public void m2(Object o) throws ChildException {
        System.out.println("Vehicle m2");
    }

    public static void m3() throws ChildException {
        System.out.println("Vehicle m3");
    }
}
