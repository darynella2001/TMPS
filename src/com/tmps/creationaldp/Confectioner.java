package com.tmps.creationaldp;

import com.tmps.creationaldp.sweets.builders.*;

public class Confectioner {
    public void sellWhiteChocolate(WhiteChocolateBuilder builder) {
        builder.create();
        builder.setName("White & Hazelnuts");
        builder.setCompany("Heidi");
        builder.setSugar(43);
        builder.setPrice(43.2);
    }

    public void sellMilkChocolate(MilkChocolateBuilder builder) {
        builder.create();
        builder.setName("Alpine Milk Chocolate");
        builder.setCompany("Schogetten");
        builder.setSugar(55);
        builder.setPrice(20.45);
    }

    public void sellDarkChocolate(DarkChocolateBuilder builder) {
        builder.create();
        builder.setName("Excellence ECUADOR 75%");
        builder.setCompany("Lindt");
        builder.setSugar(23);
        builder.setPrice(32.5);
    }

    public void sellLollipop(LollipopBuilder builder) {
        builder.create();
        builder.setName("Strawberry Lollipop");
        builder.setCompany("Chupa Chups");
        builder.setSugar(82);
        builder.setPrice(5);
    }

    public void sellGoldBears(GoldBearsBuilder builder) {
        builder.create();
        builder.setName("Goldbears");
        builder.setCompany("HARIBO");
        builder.setSugar(46);
        builder.setPrice(16.25);
    }

    public void sellCandy(CandyBuilder builder) {
        builder.create();
        builder.setName("Fruits Skittles Bag");
        builder.setCompany("Chupa Chups");
        builder.setSugar(90);
        builder.setPrice(54.95);
    }



}
