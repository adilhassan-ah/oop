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
    this.age = newAge;
  }
}
