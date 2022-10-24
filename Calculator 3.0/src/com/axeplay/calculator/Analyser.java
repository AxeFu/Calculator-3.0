package com.axeplay.calculator;

import com.axeplay.calculator.operators.*;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Analyser {

    private Analyser() {}

    private static final Operator[] operators = {new Exponent(), new Cos(), new Sin(), new Brackets(), new Factorial(), new MultiDiv(), new AddSub()};
    public static String start(String input) {
        for (Operator operator : operators) {
            Pattern pattern = Pattern.compile(operator.regex);
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                String subInput = input.substring(matcher.start(), matcher.end());
                return start(input.replace(subInput, operator.getResult(subInput)));
            }
        }
        if (input.contains(".")) input = input.replaceAll("\\.?0*$","");
        return input;
    }

}
