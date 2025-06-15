package com.adilhassan.composition;

public class Client {
  public static void main(String[] args) {
    Tyre tyre = new Tyre();
    System.out.println(tyre.getTyrePressure());
    tyre.reduceTyrePressure();
    tyre = null;
    System.out.println(tyre.getTyrePressure());
  }
}
