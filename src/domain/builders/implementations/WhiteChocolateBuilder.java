package domain.builders.implementations;

import domain.builders.abstractions.ISweetBuilder;
import models.sweets.implementations.WhiteChocolate;

public class WhiteChocolateBuilder implements ISweetBuilder {

    private WhiteChocolate whiteChocolate;

    public WhiteChocolateBuilder(){
        this.create();
    }

    public void create(){
        this.whiteChocolate = new WhiteChocolate();
    }

    @Override
    public void setName(String name) {
        this.whiteChocolate.setName(name);
    }

    @Override
    public void setCompany(String company) {
        this.whiteChocolate.setCompany(company);
    }

    public void setSugar(int sugar){
        this.whiteChocolate.setSugar(sugar);
    }

    @Override
    public void setPrice(double price) {
        this.whiteChocolate.setPrice(price);
    }

    public WhiteChocolate getSweet(){
        WhiteChocolate sweet = this.whiteChocolate;
        this.create();
        return sweet;
    }

}
