package domain.strategy.implementation;

import domain.strategy.abstractions.Strategy;

public class Birthday implements Strategy {
    @Override
    public double doDiscount(double price) {
//        do -20% discount
        return price * 0.8;
    }
}
