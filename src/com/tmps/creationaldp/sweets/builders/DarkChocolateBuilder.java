package com.tmps.creationaldp.sweets.builders;

import com.tmps.creationaldp.sweets.DarkChocolate;

public class DarkChocolateBuilder implements SweetBuilder {

    private DarkChocolate darkChocolate;

    public DarkChocolateBuilder(){
        this.create();
    }

    public void create(){
        this.darkChocolate = new DarkChocolate();
    }

    @Override
    public void setName(String name) {
        this.darkChocolate.setName(name);
    }

    @Override
    public void setCompany(String company) {
        this.darkChocolate.setCompany(company);
    }

    public void setSugar(int sugar){
        this.darkChocolate.setSugar(sugar);
    }

    @Override
    public void setPrice(double price) {
        this.darkChocolate.setPrice(price);
    }

    public DarkChocolate getSweet(){
        DarkChocolate sweet = this.darkChocolate;
        this.create();
        return sweet;
    }
}
