package com.adilhassan.accessmodifiers.publicaccessmodifier.six;


import com.adilhassan.accessmodifiers.publicaccessmodifier.five.Person;

public class Client {
  Person person1;

  public static void main(String[] args) {
//    Person person2 = new Person(); // compile-time error
//    -------------------------------------------------------------
//    can't access instance variable title and instance method getTitle() because can't create an object of class Person, therefore can't access them either

//    -------------------------------------------------------------
    System.out.println(Person.FIRST_NAME);
    System.out.println(Person.getFirstName());

//    -------------------------------------------------------------
//    can't access instance variable middleName and instance method getMiddleName() because of two reasons
//    i) can't create an object of class Person, therefore can't access instance members
//    ii) can't access default members of a class outside of the package

//    -------------------------------------------------------------
//    can't access default members of a class outside of the package
//    System.out.println(Person.LAST_NAME);
  }
}