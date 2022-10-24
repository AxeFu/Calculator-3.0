package com.axeplay.calculator.operators;

import com.axeplay.calculator.Analyser;

import java.util.Locale;

public class Sin extends Operator {

    public Sin() {
        super("sin[(][^(]+?[)]");
    }

    @Override
    public String getResult(String input) {
        return String.format(Locale.ENGLISH, "%.14f",
                Math.sin(Math.toRadians(Double.parseDouble(Analyser.start(input.substring(4, input.length()-1))))));
    }
}
