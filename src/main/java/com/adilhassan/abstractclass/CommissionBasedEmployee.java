package com.adilhassan.abstractclass;

public class CommissionBasedEmployee extends Employee {
  private double commission;
  private double sales;

  public CommissionBasedEmployee(String name, int id, double commission, double sales) {
    super(name, id);
    this.commission = commission;
    this.sales = sales;
  }

  @Override
  public double calculateEarnings() {
    return sales * (commission/100);
  }

  @Override
  public String toString() {
    return "CommissionBasedEmployee{" +
        "commission=" + commission +
        ", sales=" + sales +
        "} " + super.toString();
  }
}
