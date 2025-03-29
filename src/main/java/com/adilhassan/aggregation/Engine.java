package com.adilhassan.aggregation;

public class Engine {
  private int horsePower;

  public Engine(int horsePower) {
    this.horsePower = horsePower;
  }

  @Override
  public String toString() {
    return "Engine{" +
        "horsePower=" + horsePower +
        '}';
  }
}
