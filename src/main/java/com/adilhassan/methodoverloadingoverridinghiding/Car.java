package com.adilhassan.methodoverloadingoverridinghiding;

public class Car extends Vehicle {
    public void m1() {
        System.out.println("Car m1");
    }

    public String m2(String o) {
        System.out.println("Car m2");
        return "";
    }

    public static void m3() {
        System.out.println("Car m3");
    }
}
