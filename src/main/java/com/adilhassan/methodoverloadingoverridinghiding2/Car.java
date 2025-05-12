package com.adilhassan.methodoverloadingoverridinghiding2;

public class Car extends Vehicle {
    @Override
    public void m1() /*throws ParentException*/ {
//        throw new ParentException();
    }

    public void m2(String o) throws ParentException {
        throw new ParentException();
    }

}
