package com.adilhassan.lecream.domain;

public class Order {
    private IceCream iceCream;
    private boolean withVanillaWafer;

    public Order(IceCream iceCream, boolean withVanillaWafer) {
        this.iceCream = iceCream;
        this.withVanillaWafer = withVanillaWafer;
    }

    public IceCream getIceCream() {
        return iceCream;
    }

    public void setIceCream(IceCream iceCream) {
        this.iceCream = iceCream;
    }

    public boolean isWithVanillaWafer() {
        return withVanillaWafer;
    }

    public void setWithVanillaWafer(boolean withVanillaWafer) {
        this.withVanillaWafer = withVanillaWafer;
    }

    public int displayTotal() {
        int total = iceCream.getNumberOfScoops() * iceCream.getPricePerScoop();

        if (withVanillaWafer) {
            total += 10;
        }

        System.out.println("::Order Details::");
        System.out.println("-------------------------");
        System.out.println("Icecream flavor: " + iceCream.getFlavor());
        System.out.println("Number of scoops: " + iceCream.getNumberOfScoops());
        System.out.println("Price per scoop: " + iceCream.getPricePerScoop());
        System.out.println("With vanilla wafer: " + (withVanillaWafer ? "Yes" : "No"));
        System.out.println("-------------------------");

        System.out.println("Order Total: " + total);
        System.out.println();

        return total;
    }
}
