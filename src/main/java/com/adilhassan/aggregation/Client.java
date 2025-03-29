package com.adilhassan.aggregation;

public class Client {
  public static void main(String[] args) {
    Engine v8 = new Engine(780);
    Engine v6 = new Engine(600);
    Car car = new Car("manual", v6);
    System.out.println(car);
  }
}
