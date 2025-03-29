package com.adilhassan.aggregation;

// Aggregation - lose coupling - weak relationship
public class Car {
  private String transmission;
  private Engine engine;

  public Car(String transmission, Engine engine) {
    this.transmission = transmission;
    this.engine = engine;
  }

  @Override
  public String toString() {
    return "Car{" +
        "transmission='" + transmission + '\'' +
        ", engine=" + engine +
        '}';
  }

  // missing out of getters, setters, and equals methods
}
