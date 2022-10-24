package com.axeplay.calculator.operators;

import com.axeplay.calculator.Analyser;

import java.util.Locale;

public class Cos extends Operator {

    public Cos() {
        super("cos[(][^(]+?[)]");
    }

    @Override
    public String getResult(String input) {
        return String.format(Locale.ENGLISH, "%.14f",
                Math.cos(Math.toRadians(Double.parseDouble(Analyser.start(input.substring(4, input.length()-1))))));
    }
}
