package domain.builders.implementations;

import domain.builders.abstractions.ISweetBuilder;
import models.sweets.implementations.GoldBears;

public class GoldBearsBuilder implements ISweetBuilder {

    private GoldBears goldBears;

    public GoldBearsBuilder(){
        this.create();
    }

    public void create(){
        this.goldBears = new GoldBears();
    }

    @Override
    public void setName(String name) {
        this.goldBears.setName(name);
    }

    @Override
    public void setCompany(String company) {
        this.goldBears.setCompany(company);
    }

    public void setSugar(int sugar){
        this.goldBears.setSugar(sugar);
    }

    @Override
    public void setPrice(double price) {
        this.goldBears.setPrice(price);
    }

    public GoldBears getSweet(){
        GoldBears sweet = this.goldBears;
        this.create();
        return sweet;
    }
}
