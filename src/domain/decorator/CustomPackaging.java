package domain.decorator;

import models.sweets.abstractions.ISweet;

public class CustomPackaging extends SweetDecorator{
    public static final String YELLOW = "\u001B[33m";  // YELLOW
    public static final String RED = "\033[0;31m";     // RED
    public static final String PURPLE_BRIGHT = "\033[0;95m"; // PURPLE
    public static final String RESET = "\033[0m";

    public CustomPackaging(ISweet sweet){
        super(sweet);
    }

    public String getDetails(){
        return super.getDetails();
    }
    private String setCustomPackaging(){
        return (YELLOW + "\nYou have chosen a custom packaging for your sweet" + RESET);
    }

    public void setName(String name) {
        super.setName(name);
    }

    public void setCompany(String company){
        super.setCompany(company);
    }

    public void setSugar(int sugar) {
        super.setSugar(sugar);
    }

    public void setPrice(double price) {
        super.setPrice(price);
    }
    public String getName(){
        return super.getName();
    }

    @Override
    public String getCompany(){
        return super.getCompany();
    }

    @Override
    public int getSugar(){
        return super.getSugar();
    }

    @Override
    public double getPrice(){
        return super.getPrice() + 10;
    }

    @Override
    public String toString() {
        return "\nThe '" + getName() + "' produced by " + getCompany() + "\n" + getDetails()  + setCustomPackaging() + "\nSugar per 100g: " + RED + getSugar() + "g" + RESET + "\nPrice: "+ PURPLE_BRIGHT + getPrice() + " MDL\n" + RESET ;
    }
}
