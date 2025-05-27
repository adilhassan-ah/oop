package com.adilhassan.accessmodifiers.protectedaccessmodifier.one;

public class Employee {
  protected String firstName = "John";
  protected static String LAST_NAME = "Mike";

  protected Employee() {}

  protected String getFirstName() {
    return firstName;
  }

  protected static String getLastName() {
    return LAST_NAME;
  }
}
