package domain.decorator;

import models.sweets.abstractions.ISweet;


public abstract class SweetDecorator implements ISweet{

    private ISweet sweet;

    public SweetDecorator(ISweet sweet){
        this.sweet = sweet;
    }
    @Override
    public String getDetails(){
        return sweet.getDetails();
    }

    @Override
    public void setName(String name) {
        sweet.setName(name);
    }

    @Override
    public void setCompany(String company){
        sweet.setCompany(company);
    }

    @Override
    public void setSugar(int sugar) {
        sweet.setSugar(sugar);
    }

    @Override
    public void setPrice(double price) {
        sweet.setPrice(price);
    }

    @Override
    public String getName(){
        return sweet.getName();
    }

    @Override
    public String getCompany(){
        return sweet.getCompany();
    }

    @Override
    public int getSugar(){
        return sweet.getSugar();
    }

    @Override
    public double getPrice(){
        return sweet.getPrice();
    }

}