package com.axeplay.calculator.operators;

import com.axeplay.calculator.Analyser;

public class Brackets extends Operator {
    public Brackets() {
        super("[[^a-z]&&(][^(]+[)]");
    }

    @Override
    public String getResult(String input) {
        return Analyser.start(input.substring(1, input.length()-1));
    }
}
