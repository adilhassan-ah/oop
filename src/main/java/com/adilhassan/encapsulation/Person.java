package com.adilhassan.encapsulation;

public class Person {
  private String name;
  private int age;

  public Person(String name, int age) {
    setName(name);
    setAge(age);
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public void setName(String newName) {
    this.name = newName;
  }

  public void setAge(int newAge) {
    if (newAge < 0) {
      throw new IllegalArgumentException("person age must be greater than 0");
    }
    this.age = newAge;
  }
}

class Client {
  public static void main(String[] args) {
    Person person = new Person("adil", 12);
    person.setAge(-10);

  }
}
