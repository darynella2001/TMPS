package domain.strategy.implementation;
import domain.strategy.abstractions.Strategy;

public class DiscountCard implements Strategy{

    @Override
    public double doDiscount(double price) {
//        do a -10% discount
        return price * 0.9;
    }

}
