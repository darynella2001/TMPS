package models.sweets.implementations;

import models.sweets.abstractions.ISweet;

public class DarkChocolate implements ISweet {
    public static final String RED = "\033[0;31m";     // RED
    public static final String PURPLE_BRIGHT = "\033[0;95m"; // PURPLE
    public static final String RESET = "\033[0m";  // Text Reset
    private String name;
    private String company;
    private int sugar;
    private double price;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setCompany(String origin) {
        this.company = origin;
    }

    @Override
    public void setSugar(int sugar) {
        this.sugar = sugar;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getCompany() {
        return company;
    }

    public int getSugar() {
        return sugar;
    }

    public double getPrice() {
        return price;
    }

    public String getDetails(){
        return "Description:\033[3m Immerse your senses in a symphony of flavour with deeper cocoa notes.\033[0m";
    }

    public String toString(){
        return "The '" + name + "' produced by " + company + "\n" + getDetails() + "\n" + "Sugar per 100g: " + RED + sugar + "g" + RESET + "\nPrice: " + PURPLE_BRIGHT + price + " MDL" + RESET;
    }
}
