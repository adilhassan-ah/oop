package com.adilhassan.accessmodifiers.protectedaccessmodifier.four;

import com.adilhassan.accessmodifiers.protectedaccessmodifier.three.Employee;

public class Client {
  Employee employee;
  public static void main(String[] args) {
    Employee employee1 = new Employee();
//    System.out.println(employee1.getFirstName());   // compile-time error

//    System.out.println(Employee.LAST_NAME);         // compile-time error
//    System.out.println(Employee.getLastName());     // compile-time error
  }
}
