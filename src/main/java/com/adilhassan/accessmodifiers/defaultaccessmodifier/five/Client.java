package com.adilhassan.accessmodifiers.defaultaccessmodifier.five;//import com.javagrammar.course.ocd.accessmodifiers.nine.Person;  // compile-time error

public class Client {

  Person person1;
  public static void main(String[] args) {
    Person person2 = new Person();
    System.out.println(Person.FIRST_NAME);
    System.out.println(Person.LAST_NAME);
    System.out.println(Person.getFirstName());
    System.out.println(Person.getLastName());
  }
}