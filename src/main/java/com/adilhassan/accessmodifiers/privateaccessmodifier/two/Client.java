package com.adilhassan.accessmodifiers.privateaccessmodifier.two;

import com.adilhassan.accessmodifiers.privateaccessmodifier.one.Employee;

public class Client {
  Employee employee;
  public static void main(String[] args) {
//    Employee employee = new Employee();     //  compile-time error
//    System.out.println(employee.firstName);
//    System.out.println(employee.getFirstName());
//    System.out.println(Employee.LAST_NAME); //  compile-time error
//    System.out.println(Employee.getLastName()); //  compile-time error
  }
}