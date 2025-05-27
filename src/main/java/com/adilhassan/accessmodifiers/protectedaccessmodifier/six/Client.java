package com.adilhassan.accessmodifiers.protectedaccessmodifier.six;

import com.adilhassan.accessmodifiers.protectedaccessmodifier.three.Employee;

public class Client extends Employee {

  public static void main(String[] args) {

    Employee employee1 = new Employee();
//    System.out.println(employee1.getFirstName());   // compile-time error

    Employee employee2 = new Client();
//    System.out.println(employee2.getFirstName());   // compile-time error

    Client client = new Client();
    System.out.println(client.getFirstName());
  }
}
