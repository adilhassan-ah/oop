package com.adilhassan.equalsmethod.v4;

public class Client {
  public static void main(String[] args) {
    Employee e1 = new Employee("A", 1);
    SalaryBasedEmployee e2 = new SalaryBasedEmployee("A", 1, 50);

    System.out.println("e1.equals(e2): " + e1.equals(e2));
  }
}
