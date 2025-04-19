//package com.adilhassan.methodoverloadingoverridinghiding2;
//
//public class Client {
//    public static void main(String[] args) {
//        Vehicle vehicle = new Vehicle();
//        try {
//            vehicle.m1();
//        } catch (ChildException e) {
//            System.out.println("Exception Caught vehicle.m1()");
//        }
//        try {
//            vehicle.m2("A");
//        } catch (ChildException e) {
//            throw new RuntimeException(e);
//        }
//        try {
//            vehicle.m3();
//        } catch (ChildException e) {
//            throw new RuntimeException(e);
//        }
//
//        System.out.println("---");
//
//        Car car = new Car();
//        try {
//            car.m1();
//        } catch (ParentException e) {
//            System.out.println("Exception Caught car.m1()");
//        }
//        try {
//            car.m2("B");
//        } catch (ParentException e) {
//            throw new RuntimeException(e);
//        }
//        try {
//            car.m3();
//        } catch (ParentException e) {
//            throw new RuntimeException(e);
//        }
//
//        System.out.println("---");
//
//        Vehicle vehicle1 = new Car();
//        try {
//            vehicle1.m1();
//        } catch (ChildException e) {
//            throw new RuntimeException(e);
//        }
//        try {
//            vehicle1.m2("C");
//        } catch (ChildException e) {
//            throw new RuntimeException(e);
//        }
//        try {
//            vehicle1.m3();
//        } catch (ChildException e) {
//            throw new RuntimeException(e);
//        }
//    }
//}
