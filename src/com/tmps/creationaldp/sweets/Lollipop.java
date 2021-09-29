package com.tmps.creationaldp.sweets;

public class Lollipop implements Sweet{
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

    public String getDetails(){
        return "Slogan: Es redondo y dura mucho, Chupa Chups (en:It's round and long-lasting!)";
    }

    public String toString(){
        return "\nThe '" + name + "' produced by " + company + "\n" + getDetails() + "\n" + "Sugar per 100g: " + sugar + "g" + "\nPrice: " + price + " MDL";
    }
}
