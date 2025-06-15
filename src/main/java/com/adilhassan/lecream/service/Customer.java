package com.adilhassan.lecream.service;

import com.adilhassan.lecream.domain.IceCream;
import com.adilhassan.lecream.domain.Order;

import java.util.Scanner;

import static com.adilhassan.lecream.LeCreamSystem.flavors;

public class Customer {

    private static final Scanner scanner = new Scanner(System.in);

    public Order placeOrder() {
        String flavor;
        do {
            System.out.println("Please specify the flavor of ice cream from the menu");
            flavor = scanner.nextLine();
        } while (!isFlavorSelectedFromTheMenu(flavor));

        int numberOfScoops;
        do {
            System.out.println("Please specify the number of scoops (no more than 3)");
            numberOfScoops = scanner.nextInt();
        } while (numberOfScoops > 3);

        System.out.println("Do you want a vanilla wafer? (yes/no)");
        scanner.nextLine();
        String withVanillaWaferInput = scanner.nextLine();
        boolean withVanillaWafer = withVanillaWaferInput.equalsIgnoreCase("yes");

        IceCream iceCream = new IceCream(numberOfScoops, flavor);
        Order order = new Order(iceCream, withVanillaWafer);

        return order;
    }

    private boolean isFlavorSelectedFromTheMenu(String selectedFlavor) {
        for (String flavor : flavors) {
            if (flavor.equalsIgnoreCase(selectedFlavor)) {
                return true;
            }
        }

        return false;
    }
}
