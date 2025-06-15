package com.adilhassan.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {
  public static void main(String[] args) {
    Employee e1 = new Employee("A", 1);
    Employee e2 = new Employee("B", 2);
    Employee e3 = new Employee("C", 3);

    ArrayList<Employee> employees = new ArrayList<>();
    employees.add(e1);
    employees.add(e2);
    employees.add(e3);

//    // you are asking to user to enter the name and id of the employee you want to remove
    Scanner scanner = new Scanner(System.in);
    var name = scanner.nextLine();
    var id = scanner.nextInt();

    var employeeToRemove = new Employee(name, id);

    employees.remove(employeeToRemove);
    System.out.println(employees);
  }
}
