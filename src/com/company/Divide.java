package com.company;

public class Divide implements IOperation{
    @Override
    public String getSign() {
        return "/";
    }

    @Override
    public String getName() {
        return "divide";
    }

    @Override
    public int estimate(int a, int b) {
        return a/b;
    }
}
