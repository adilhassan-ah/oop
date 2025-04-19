package com.adilhassan.inheritance;

// inheritance IS-A relationship
public class Car extends Vehicle {
  private int topSpeed;

  public Car(String name, String makeYear, int topSpeed) {
    super(name, makeYear); // calling super to initialise members variables of name and makeYear in the super class
    this.topSpeed = topSpeed;
  }

  // calling Vehicle class toString method
  @Override
  public String toString() {
    return "Car{" +
        "topSpeed=" + topSpeed +
        "} " + super.toString();  // <-- calling Vehicle class toString method
  }
}
