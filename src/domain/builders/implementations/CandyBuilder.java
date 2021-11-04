package domain.builders.implementations;

import domain.builders.abstractions.ISweetBuilder;
import domain.decorator.CustomPackaging;
import models.sweets.implementations.Candy;
//import static client.Main.needsCustomPackage;

public class CandyBuilder implements ISweetBuilder {

    private Candy candy;

    public CandyBuilder(){
        this.create();
    }

    public void create(){
        this.candy = new Candy();
    }

    @Override
    public void setName(String name) {
        this.candy.setName(name);
    }

    @Override
    public void setCompany(String company) {
        this.candy.setCompany(company);
    }

    public void setSugar(int sugar){
        this.candy.setSugar(sugar);
    }

    @Override
    public void setPrice(double price) {
        this.candy.setPrice(price);
    }

    public Candy getSweet(){
        Candy sweet = this.candy;
        this.create();
        return sweet;
    }
}
