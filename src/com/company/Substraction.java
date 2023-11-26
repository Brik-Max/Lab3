package com.company;

public class Substraction implements IOperation{
    @Override
    public String getSign() {
        return "-";
    }

    @Override
    public String getName() {
        return "substraction";
    }

    @Override
    public int estimate(int a, int b) {
        return a-b;
    }
}
