package com.adilhassan.accessmodifiers.defaultaccessmodifier.five;

class Person {
  public String title = "Mr.";
  public static String FIRST_NAME = "John";
  String middleName = "Dan";
  static String LAST_NAME = "Mike";

  public Person(){}

  public String getTitle() {
    return title;
  }

  public static String getFirstName() {
    return FIRST_NAME;
  }

  String getMiddleName() {
    return middleName;
  }

  static String getLastName() {
    return LAST_NAME;
  }
}