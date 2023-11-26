package com.company;

public class Addition implements IOperation{
    @Override
    public String getSign() {
        return "+";
    }

    @Override
    public String getName() {
        return "addition";
    }

    @Override
    public int estimate(int a, int b) {
        return a+b;
    }
}
