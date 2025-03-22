package com.adilhassan.equalsmethod.v2;

public class Client {
  public static void main(String[] args) {
    int i = 10;
    int j = 10;
    System.out.println("i == j: " + (i == j));

    Employee e1 = new Employee("A", 1);
    Employee e2 = new Employee("B", 1);

    System.out.println("e1 == e2:" + (e1 == e2));
    System.out.println("e1.equals(e2): " + e1.equals(e2));
  }
}
