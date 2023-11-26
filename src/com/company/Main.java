package com.company;

public class Main {
    public static void main(String[] args) {

        IOperation[] operations = {
                new Addition(),
                new Substraction(),
                new Multiplication(),
                new Divide(),
                new Power()
        };

        int a = 10, b = 2;
        for (IOperation op: operations){
            System.out.println(op.getName());
            System.out.println(a + " " + op.getSign() + " " + b + " = " + op.estimate(a,b));
        }
    }
}