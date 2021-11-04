package domain.builders.implementations;

import domain.builders.abstractions.ISweetBuilder;
import models.sweets.implementations.MilkChocolate;

public class MilkChocolateBuilder implements ISweetBuilder {

    private MilkChocolate milkChocolate;

    public MilkChocolateBuilder(){
        this.create();
    }

    public void create(){
        this.milkChocolate = new MilkChocolate();
    }

    @Override
    public void setName(String name) {
        this.milkChocolate.setName(name);
    }

    @Override
    public void setCompany(String company) {
        this.milkChocolate.setCompany(company);
    }

    public void setSugar(int sugar){
        this.milkChocolate.setSugar(sugar);
    }

    @Override
    public void setPrice(double price) {

        this.milkChocolate.setPrice(price);
    }

    public MilkChocolate getSweet(){
        MilkChocolate sweet = this.milkChocolate;
        this.create();
        return sweet;
    }
}
