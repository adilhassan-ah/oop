package com.adilhassan.equalsmethod.v3;

public class Client {
  public static void main(String[] args) {
    Employee e1 = new Employee("A", 1);
    Car c1 = new Car("suzuki");

//    System.out.println("e1 == e2:" + (e1 == c1));
    System.out.println("e1.equals(c1): " + e1.equals(c1));
  }
}
