package com.tmps.creationaldp.sweets.builders;

import com.tmps.creationaldp.sweets.Lollipop;

public class LollipopBuilder implements SweetBuilder {

    private Lollipop lollipop;

    public LollipopBuilder(){
        this.create();
    }

    public void create(){
        this.lollipop = new Lollipop();
    }

    @Override
    public void setName(String name) {
        this.lollipop.setName(name);
    }

    @Override
    public void setCompany(String company) {
        this.lollipop.setCompany(company);
    }

    public void setSugar(int sugar){
        this.lollipop.setSugar(sugar);
    }

    @Override
    public void setPrice(double price) {
        this.lollipop.setPrice(price);
    }

    public Lollipop getSweet(){
        Lollipop sweet = this.lollipop;
        this.create();
        return sweet;
    }
}
