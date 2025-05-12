package com.adilhassan.methodoverloadingoverridinghiding2;

public class Vehicle {

    public void m1() throws ChildException {
        throw new ChildException();
    }

    public void m2(Object o) throws ChildException {
        throw new ChildException();
    }
}
