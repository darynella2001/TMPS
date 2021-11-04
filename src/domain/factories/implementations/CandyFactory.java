package domain.factories.implementations;

import domain.decorator.CustomPackaging;
import models.actors.Confectioner;
import domain.factories.abstractions.IAbstractFactory;
import models.sweets.abstractions.ISweet;
import domain.builders.implementations.LollipopBuilder;
import domain.builders.implementations.GoldBearsBuilder;
import domain.builders.implementations.CandyBuilder;
import models.sweets.implementations.Lollipop;

//import static client.Main.needsCustomPackage;

public class CandyFactory implements IAbstractFactory {
    private static CandyFactory candyFactory;
    private final Confectioner confectioner = new Confectioner();
    public static CandyFactory getCandyFactory(){
        if (candyFactory == null)
            candyFactory = new CandyFactory();
        return candyFactory;
    }

    private CandyFactory(){}

    public ISweet sellSweet(String name, boolean needsCustomPackage) {
        ISweet sweet = null;
        if (name == null) {
            return null;
        }
        if (name.toLowerCase() == "lollipop") {
            LollipopBuilder lollipopBuilder = new LollipopBuilder();
            confectioner.sellLollipop(lollipopBuilder);
            sweet = lollipopBuilder.getSweet();

        } else if (name.toLowerCase() == "goldenbears") {
            GoldBearsBuilder goldbearsBuilder = new GoldBearsBuilder();
            confectioner.sellGoldBears(goldbearsBuilder);
            sweet = goldbearsBuilder.getSweet();

        } else if (name.toLowerCase() == "candy") {
            CandyBuilder candyBuilder = new CandyBuilder();
            confectioner.sellCandy(candyBuilder);
            sweet = candyBuilder.getSweet();
        }
        if (needsCustomPackage == true){
            sweet = new CustomPackaging(sweet);
//            return sweet;
        }
        return sweet;
    }
}


