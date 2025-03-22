package com.adilhassan.equalsmethod.v4;

// an object is an instance of a class
// (inheritance) extends :: IS-A
// aggregation :: HAS-A
public class SalaryBasedEmployee extends Employee {
  private double salary;

  public SalaryBasedEmployee(String name, int id, double salary) {
    super(name, id);
    this.salary = salary;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }
}