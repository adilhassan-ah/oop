package com.adilhassan.accessmodifiers.protectedaccessmodifier.three;

public class Employee {
  protected String firstName = "John";
  protected static String LAST_NAME = "Mike";

  public Employee() {}

  protected String getFirstName() {
    return firstName;
  }

  protected static String getLastName() {
    return LAST_NAME;
  }
}
