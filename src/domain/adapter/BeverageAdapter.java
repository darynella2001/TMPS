package domain.adapter;

import models.beverages.abstractions.IBeverage;
import models.sweets.abstractions.*;

public class BeverageAdapter implements ISweet {
    private final IBeverage juice;

    public BeverageAdapter(IBeverage beverage){
        this.juice = beverage;
    }

    public String toString(){
        return juice.toString();
    }


    @Override
    public String getDetails() {return null;    }

    @Override
    public void setName(String name) {  }

    @Override
    public void setCompany(String company) {}

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getCompany() {
        return null;
    }

    @Override
    public void setSugar(int sugar) {}

    @Override
    public int getSugar() {
        return 0;
    }

    @Override
    public void setPrice(double price) { }

    @Override
    public double getPrice() {
        return 0;
    }

}
