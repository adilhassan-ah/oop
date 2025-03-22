package com.adilhassan.equalsmethod.v2;

import java.util.Objects;

public class Employee extends Object {
  private String name;
  private int id;

  public Employee(String name, int id) {
    this.name = name;
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  @Override
  public String toString() {
    return "Employee{" +
        "name='" + name + '\'' +
        ", id=" + id +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }

    if (o == null || this.getClass() != o.getClass()) {
      return false;
    }

    Employee employee = (Employee) o;
    return (this.id == employee.id) && (this.name.equals(employee.name));
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, id);
  }
}
