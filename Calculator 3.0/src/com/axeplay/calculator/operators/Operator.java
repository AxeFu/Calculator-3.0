package com.axeplay.calculator.operators;

public abstract class Operator {

    public final String regex;

    protected Operator(String regex) {
        this.regex = regex;
    }

    public abstract String getResult(String input);
}
