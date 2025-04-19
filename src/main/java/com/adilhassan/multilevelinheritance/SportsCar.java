package com.adilhassan.multilevelinheritance;

// inheritance IS-A relationship
// SportsCar IS-A Car
// And if you go to the Car class you will see Car IS-A Vehicle
// therefore SportsCar is a Vehicle
/*
          Vehicle
            ^
            |
           Car
            ^
            |
         SportsCar
 */
public class SportsCar extends Car {
  private boolean isElectric;

  public SportsCar(String name, String makeYear, int topSpeed, boolean isElectric) {
    super(name, makeYear, topSpeed);
    this.isElectric = isElectric;
  }

  @Override
  public String toString() {
    return "SportsCar{" +
        "isElectric=" + isElectric +
        "} " + super.toString();
  }

  // missing out of getters, setters, and equals methods

}
