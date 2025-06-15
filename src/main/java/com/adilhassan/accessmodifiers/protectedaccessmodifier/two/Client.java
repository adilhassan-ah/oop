package com.adilhassan.accessmodifiers.protectedaccessmodifier.two;

import com.adilhassan.accessmodifiers.protectedaccessmodifier.one.Employee;

public class Client { // also explain even if we extend the class Client with Class Employee we still can't create an object of the type Employee
  Employee employee;
  public static void main(String[] args) {
//    Employee employee1 = new Employee();            //  compile-time error
//    System.out.println(employee1.getFirstName());   //  compile-time error
//    System.out.println(Employee.LAST_NAME);         //  compile-time error
  }
}
