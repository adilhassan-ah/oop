package com.adilhassan.passbyvalue.v1;

public class Client {
    public static void main(String[] args) {
        Car c1 = new Car("Suzuki");
        System.out.println("before calling modifyCar: " + c1.getModel());
        modifyCar(c1);
        System.out.println("after calling modifyCar: " + c1.getModel());
    }

    public static void modifyCar(final Car c2) {
        c2.setModel("Honda");
    }
}
