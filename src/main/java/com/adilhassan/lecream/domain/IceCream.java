package com.adilhassan.lecream.domain;

public class IceCream {
    private int numberOfScoops;
    private String flavor;
    private int pricePerScoop;

    public IceCream(int numberOfScoops, String flavor) {
        setNumberOfScoops(numberOfScoops);
        setFlavor(flavor);
    }

    public int getNumberOfScoops() {
        return numberOfScoops;
    }

    public void setNumberOfScoops(int numberOfScoops) {
        if (numberOfScoops > 3) {
            System.out.println("You can't have more than 3 scoops");
            return;
        }
        this.numberOfScoops = numberOfScoops;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;

        if (flavor.equalsIgnoreCase("chocolate")) {
            setPricePerScoop(60);
        } else {
            setPricePerScoop(50);
        }
    }

    public int getPricePerScoop() {
        return pricePerScoop;
    }

    public void setPricePerScoop(int pricePerScoop) {
        this.pricePerScoop = pricePerScoop;
    }
}
