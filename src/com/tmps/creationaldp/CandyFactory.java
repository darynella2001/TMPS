package com.tmps.creationaldp;

import com.tmps.creationaldp.sweets.Sweet;
import com.tmps.creationaldp.sweets.builders.LollipopBuilder;
import com.tmps.creationaldp.sweets.builders.GoldBearsBuilder;
import com.tmps.creationaldp.sweets.builders.CandyBuilder;

public class CandyFactory implements AbstractFactory {
    private static CandyFactory candyFactory;
    private final Confectioner confectioner = new Confectioner();

    public static CandyFactory getCandyFactory(){
        if (candyFactory == null)
            candyFactory = new CandyFactory();
        return candyFactory;
    }

    private CandyFactory(){}

    public Sweet sellSweet(String name) {
        if (name == null) {
            return null;
        }
        if (name.toLowerCase() == "lollipop") {
            LollipopBuilder lollipopBuilder = new LollipopBuilder();
            confectioner.sellLollipop(lollipopBuilder);
            return lollipopBuilder.getSweet();

        } else if (name.toLowerCase() == "goldenbears") {
            GoldBearsBuilder goldbearsBuilder = new GoldBearsBuilder();
            confectioner.sellGoldBears(goldbearsBuilder);
            return goldbearsBuilder.getSweet();

        } else if (name.toLowerCase() == "candy") {
            CandyBuilder candyBuilder = new CandyBuilder();
            confectioner.sellCandy(candyBuilder);
            return candyBuilder.getSweet();
        }
        return null;
    }
}


