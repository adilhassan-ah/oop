package com.adilhassan.composition;

// Composition - strong coupling - strong relationship
public class Tyre {
  private TyrePressure tyrePressure;

  public Tyre() {
    this.tyrePressure = new TyrePressure(5);
  }

  @Override
  public String toString() {
    return "Tyre{" +
        "tyrePressure=" + tyrePressure +
        '}';
  }

  public void setTyrePressure(TyrePressure tyrePressure) {
    this.tyrePressure = tyrePressure;
  }

  public void reduceTyrePressure() {
    tyrePressure.reduce();
  }

  public int getTyrePressure() {
    return tyrePressure.getPressure();
  }

  // missing out of getters, setters, and equals methods
}
