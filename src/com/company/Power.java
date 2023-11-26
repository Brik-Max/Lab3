package com.company;

public class Power implements IOperation{
    @Override
    public String getSign() {
        return "**";
    }

    @Override
    public String getName() {
        return "power";
    }

    @Override
    public int estimate(int a, int b) {
        int result = a;
        for (int i = 1; i < b; i++){
            result = result * a;
        }
        return result;
    }
}
