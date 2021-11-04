package models.beverages.implementations;

import models.beverages.abstractions.IBeverage;

public class Tea implements IBeverage {
    public static final String PURPLE_BRIGHT = "\033[0;95m"; // PURPLE
    public static final String CYAN = "\033[0;36m";    // CYAN
    public static final String RESET = "\033[0m";  // Text Reset
    private String name;
    private float price;

    public Tea(String name, float price){
        this.name = name;
        this.price = price;
    }

    @Override
    public void setName(String name) {
        this.name = name + "Tea";
    }

    @Override
    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Beverage: " + CYAN + name + " Tea" + RESET + "\nPrice: " + PURPLE_BRIGHT + price + " MDL\n" + RESET;
    }
}
