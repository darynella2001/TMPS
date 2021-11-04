package domain.factories.implementations;

import domain.decorator.CustomPackaging;
import models.actors.Confectioner;
import domain.factories.abstractions.IAbstractFactory;
import models.sweets.abstractions.ISweet;
import domain.builders.implementations.WhiteChocolateBuilder;
import domain.builders.implementations.MilkChocolateBuilder;
import domain.builders.implementations.DarkChocolateBuilder;

public class ChocolateFactory implements IAbstractFactory {
    private static ChocolateFactory chocolateFactory;
    private final Confectioner confectioner = new Confectioner();

    public static ChocolateFactory getChocolateFactory(){
        if (chocolateFactory == null)
            chocolateFactory = new ChocolateFactory();
        return chocolateFactory;
    }

    private ChocolateFactory(){}

    public ISweet sellSweet(String name, boolean needsCustomPackage) {
        ISweet sweet = null;
        if (name == null) {
            return null;
        }
        if (name.toLowerCase() == "white chocolate") {
            WhiteChocolateBuilder whiteChocolateBuilder = new WhiteChocolateBuilder();
            confectioner.sellWhiteChocolate(whiteChocolateBuilder);
            sweet = whiteChocolateBuilder.getSweet();
        } else if (name.toLowerCase() == "milk chocolate") {
            MilkChocolateBuilder milkChocolateBuilder = new MilkChocolateBuilder();
            confectioner.sellMilkChocolate(milkChocolateBuilder);
            sweet = milkChocolateBuilder.getSweet();
        } else if (name.toLowerCase() == "dark chocolate") {
            DarkChocolateBuilder darkChocolateBuilder = new DarkChocolateBuilder();
            confectioner.sellDarkChocolate(darkChocolateBuilder);
            sweet = darkChocolateBuilder.getSweet();
        }
        if (needsCustomPackage){
            sweet = new CustomPackaging(sweet);
//            return sweet;
        }
        return sweet;
    }
}


