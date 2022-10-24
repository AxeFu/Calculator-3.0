package com.axeplay.calculator.operators;

public class Factorial extends Operator {

    public Factorial() {
        super("-?[0-9]+([.,][0-9]+)?!");
    }

    @Override
    public String getResult(String input) {
        double n = Integer.parseInt(input.substring(0, input.length()-1));
        return "Math.sqrt(2*PI*n)*()";
    }
}
