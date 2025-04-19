package com.adilhassan.abstractclass;

public class Client {
  public static void main(String[] args) {

    Employee salaryBasedEmployee = new SalaryBasedEmployee("A", 1, 30000);
    Employee commissionBasedEmployee = new CommissionBasedEmployee("B", 2, 50, 30000);

    System.out.println(salaryBasedEmployee.calculateEarnings());
    System.out.println(commissionBasedEmployee.calculateEarnings());

  }
}
