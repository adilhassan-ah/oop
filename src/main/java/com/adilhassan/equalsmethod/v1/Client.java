package com.adilhassan.equalsmethod.v1;

public class Client {
  public static void main(String[] args) {
    int i = 10;
    int j = 10;
    System.out.println("i == j: " + (i == j));

    Employee e1 = new Employee("A", 1);  // e1:12345 --> O1
    Employee e2 = new Employee("A", 1); //  e2:56789 ---> O2

    System.out.println("e1 == e2:" + (e1 == e2));
    System.out.println("e1.equals(e2): " + e1.equals(e2));
    /*
     public boolean equals(Object obj) {
        return (this == obj);
    }
     */
    // e1 == e2
  }
}
