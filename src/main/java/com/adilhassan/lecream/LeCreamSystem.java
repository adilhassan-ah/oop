package com.adilhassan.lecream;

import com.adilhassan.lecream.domain.Order;
import com.adilhassan.lecream.service.Customer;

import java.util.Scanner;

public class LeCreamSystem {

    private static final Scanner scanner = new Scanner(System.in);
    public static final String[] flavors = {"Strawberry", "Chocolate", "Vanilla", "Mango"};

    public static void main(String[] args) {
        System.out.println("Welcome to LeCream System");
        System.out.println("============================");

        boolean placeAnOrder = true;

        while (placeAnOrder) {
            System.out.println(":: Ice cream Menu ::");

            for (String flavor : flavors) {
                System.out.println(flavor);
            }

            System.out.println();

            Customer customer = new Customer();
            Order order = customer.placeOrder();
            order.displayTotal();

            System.out.println("Do you want to place another order? (yes/no)");
            String response = scanner.nextLine();
            placeAnOrder = response.equalsIgnoreCase("yes");
        }

        System.out.println("Thank you for using LeCream System!");
    }
}