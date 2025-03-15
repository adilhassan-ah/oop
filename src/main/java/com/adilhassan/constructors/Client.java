package com.adilhassan.constructors;

public class Client {
  public static void main(String[] args) {

    Person p = new Person("A", 20);
    // creating an object of type Person, referenced by a reference variable p of type Person.
    // Person is the type of the reference variable
    // p is the reference variable
    // new Person("A", 20); here we are creating an object of type Person and initialised it with values name: A and age: 20

    System.out.println(p.getAge());

    p.setAge(-1);
  }
}
