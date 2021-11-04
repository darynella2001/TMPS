package domain.composite;

import models.beverages.abstractions.IBeverage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CompositePattern implements IBeverage {
    private String name;

    private List<IBeverage> childBeverages;

    public CompositePattern(String name){
        this.name = name;
        this.childBeverages = new ArrayList<>();
    }

    public void addBeverage(IBeverage beverage){
        childBeverages.add(beverage);
    }

    public void removeBeverage(IBeverage beverage){
        childBeverages.remove(beverage);
    }

    @Override
    public void setName(String name){
        for (IBeverage childBeverage : childBeverages) {
            childBeverage.setName(name);
        }
    }
    @Override
    public void setPrice(float price) {
        for (IBeverage childBeverage : childBeverages) {
            childBeverage.setPrice(price);
        }
    }

    @Override
    public String getName() {
        return name;
    }
}
