package com.tmps.creationaldp;

import com.tmps.creationaldp.sweets.Sweet;

public interface AbstractFactory {
    Sweet sellSweet(String name);
}
