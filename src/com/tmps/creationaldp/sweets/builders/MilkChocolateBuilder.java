package com.tmps.creationaldp.sweets.builders;

import com.tmps.creationaldp.sweets.MilkChocolate;

public class MilkChocolateBuilder implements SweetBuilder {

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
