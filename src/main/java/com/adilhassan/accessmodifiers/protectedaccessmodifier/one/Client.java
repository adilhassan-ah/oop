package com.adilhassan.accessmodifiers.protectedaccessmodifier.one;

public class Client {
  public static void main(String[] args) {
    Employee employee = new Employee();

    System.out.println(employee.getFirstName());
    System.out.println(Employee.LAST_NAME);
    System.out.println(Employee.getLastName());
  }
}
