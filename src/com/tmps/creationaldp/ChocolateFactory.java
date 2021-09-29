package com.tmps.creationaldp;

import com.tmps.creationaldp.sweets.Sweet;
import com.tmps.creationaldp.sweets.builders.WhiteChocolateBuilder;
import com.tmps.creationaldp.sweets.builders.MilkChocolateBuilder;
import com.tmps.creationaldp.sweets.builders.DarkChocolateBuilder;

public class ChocolateFactory implements AbstractFactory {
    private static ChocolateFactory chocolateFactory;
    private final Confectioner confectioner = new Confectioner();

    public static ChocolateFactory getChocolateFactory(){
        if (chocolateFactory == null)
            chocolateFactory = new ChocolateFactory();
        return chocolateFactory;
    }

    private ChocolateFactory(){}

    public Sweet sellSweet(String name) {
        if (name == null) {
            return null;
        }
        if (name.toLowerCase() == "white chocolate") {
            WhiteChocolateBuilder whiteChocolateBuilder = new WhiteChocolateBuilder();
            confectioner.sellWhiteChocolate(whiteChocolateBuilder);
            return whiteChocolateBuilder.getSweet();
        } else if (name.toLowerCase() == "milk chocolate") {
            MilkChocolateBuilder milkChocolateBuilder = new MilkChocolateBuilder();
            confectioner.sellMilkChocolate(milkChocolateBuilder);
            return milkChocolateBuilder.getSweet();
        } else if (name.toLowerCase() == "dark chocolate") {
            DarkChocolateBuilder darkChocolateBuilder = new DarkChocolateBuilder();
            confectioner.sellDarkChocolate(darkChocolateBuilder);
            return darkChocolateBuilder.getSweet();
        }
        return null;
    }
}


