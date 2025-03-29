package com.adilhassan.composition;

public class TyrePressure {
  private int pressure;
  // unit
  // ...
  // ..

  public TyrePressure(int pressure) {
    this.pressure = pressure;
  }

  @Override
  public String toString() {
    return "TyrePressure{" +
        "pressure=" + pressure +
        '}';
  }

  public void reduce() {
    pressure = pressure - 1;
  }

  public int getPressure() {
    return pressure;
  }

  // missing out of getters, setters, and equals methods
}
