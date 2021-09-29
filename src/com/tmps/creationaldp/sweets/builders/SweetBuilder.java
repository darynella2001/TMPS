package com.tmps.creationaldp.sweets.builders;

public interface SweetBuilder {
    void create();
    void setName(String name);
    void setCompany(String company);
    void setSugar(int sugar);
    void setPrice(double price);
}
