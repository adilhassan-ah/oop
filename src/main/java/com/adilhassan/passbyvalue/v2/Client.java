package com.adilhassan.passbyvalue.v2;

public class Client {
    public static void main(String[] args) {
        Car c1 = new Car("Suzuki");
        System.out.println("before calling modifyCar: " + c1.getModel());
        modifyCar(c1);
        System.out.println("after calling modifyCar: " + c1.getModel());
    }

    public static void modifyCar(Car c2) {
        c2 = new Car("Honda");
        c2.setModel("Kia");
    }
}
