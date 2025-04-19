package com.adilhassan.abstractclass;

public class SalaryBasedEmployee extends Employee {
  private double salary;

  public SalaryBasedEmployee(String name, int id, double salary) {
    super(name, id);
    this.salary = salary;
  }

  @Override
  public double calculateEarnings() {
    return salary;
  }

  @Override
  public String toString() {
    return "SalaryBasedEmployee{" +
        "salary=" + salary +
        "} " + super.toString();
  }
}
