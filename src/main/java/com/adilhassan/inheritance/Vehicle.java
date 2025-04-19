package com.adilhassan.inheritance;

public class Vehicle {
  private String name;
  private String makeYear;

  public Vehicle(String name, String makeYear) {
    this.name = name;
    this.makeYear = makeYear;
  }

  @Override
  public String toString() {
    return "Vehicle{" +
        "name='" + name + '\'' +
        ", makeYear='" + makeYear + '\'' +
        '}';
  }

  // missing out of getters, setters, and equals methods
}
