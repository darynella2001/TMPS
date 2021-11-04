package domain.factories.abstractions;

import models.sweets.abstractions.ISweet;

public interface IAbstractFactory {
    ISweet sellSweet(String name, boolean needsCustomPackage);
}
