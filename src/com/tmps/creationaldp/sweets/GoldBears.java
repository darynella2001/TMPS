package com.tmps.creationaldp.sweets;

public class GoldBears implements Sweet{
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
        return "Slogan: Haribo macht Kinder froh – und Erwachsene ebenso (en: Haribo makes children happy – and adults as well)";
    }

    public String toString(){
        return "\nThe '" + name + "' produced by " + company + "\n" + getDetails() + "\n" + "Sugar per 100g: " + sugar + "g" + "\nPrice: " + price + " MDL";
    }
}
