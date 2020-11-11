package com.company;

public class Soup <T extends Number> implements Game<T>{

    @Override
    public double minus(T god, T dog) {
        return god.doubleValue()+dog.doubleValue();
    }
}
