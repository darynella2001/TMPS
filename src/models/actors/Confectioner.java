package models.actors;

import domain.builders.implementations.*;


public class Confectioner {
    public static final String RESET = "\033[0m";  // Text Reset
    public static final String BLUE_BRIGHT = "\033[0;94m";   // BLUE
    public static final String CYAN = "\033[0;36m";    // CYAN

    public void sellWhiteChocolate(WhiteChocolateBuilder builder) {
        builder.create();
        builder.setName(BLUE_BRIGHT + "White & Hazelnuts" + RESET);
        builder.setCompany(CYAN + "Heidi" + RESET);
        builder.setSugar(43);
        builder.setPrice(43.2);
    }

    public void sellMilkChocolate(MilkChocolateBuilder builder) {
        builder.create();
        builder.setName(BLUE_BRIGHT + "Alpine Milk Chocolate" + RESET);
        builder.setCompany(CYAN + "Schogetten" + RESET);
        builder.setSugar(55);
        builder.setPrice(20.45);
    }

    public void sellDarkChocolate(DarkChocolateBuilder builder) {
        builder.create();
        builder.setName(BLUE_BRIGHT + "Excellence ECUADOR 75%" + RESET);
        builder.setCompany(CYAN + "Lindt" + RESET);
        builder.setSugar(23);
        builder.setPrice(32.5);
    }

    public void sellLollipop(LollipopBuilder builder) {
        builder.create();
        builder.setName(BLUE_BRIGHT + "Strawberry Lollipop" + RESET);
        builder.setCompany(CYAN + "Chupa Chups" + RESET);
        builder.setSugar(82);
        builder.setPrice(5);
    }

    public void sellGoldBears(GoldBearsBuilder builder) {
        builder.create();
        builder.setName(BLUE_BRIGHT + "Goldbears" + RESET);
        builder.setCompany(CYAN + "HARIBO" + RESET);
        builder.setSugar(46);
        builder.setPrice(16.25);
    }

    public void sellCandy(CandyBuilder builder) {
        builder.create();
        builder.setName(BLUE_BRIGHT + "Fruits Skittles Bag" + RESET);
        builder.setCompany(CYAN + "Chupa Chups" + RESET);
        builder.setSugar(90);
        builder.setPrice(54.95);
    }



}
