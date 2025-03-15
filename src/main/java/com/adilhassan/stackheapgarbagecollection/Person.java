package com.adilhassan.stackheapgarbagecollection;

public class Person {
  private String name;
  private int age;

  public Person() {}

  public Person(String name) {
    this(name, 0);
  }

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
    if (age < 0) {
      throw new RuntimeException("age must not be less than 0");
    }
    this.age = newAge;
  }
}
