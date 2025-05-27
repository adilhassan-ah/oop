package com.adilhassan.accessmodifiers.privateaccessmodifier.one;

public class Employee {
  private String firstName = "Dan";
  private static String LAST_NAME = "Mike";
  
  private Employee() {}

  public static void main(String[] args) {
    Employee e = new Employee();
    System.out.println(e.firstName);
    System.out.println(e.getFirstName());
    System.out.println(LAST_NAME);
  }

  private String getFirstName() {
    return firstName;
  }

  private static String getLastName() {
    return LAST_NAME;
  }
}