package com.adilhassan.abstractclass;

public abstract class Employee {
  private String name;
  private int id;

  public Employee(String name, int id) {
    this.name = name;
    this.id = id;
  }

  public void officeHours() {
    System.out.println("9-5");
  }

  public abstract double calculateEarnings();

  @Override
  public String toString() {
    return "Employee{" +
        "name='" + name + '\'' +
        ", id=" + id +
        '}';
  }
}
