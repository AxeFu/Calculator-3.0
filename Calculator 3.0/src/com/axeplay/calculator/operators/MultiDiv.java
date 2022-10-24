package com.axeplay.calculator.operators;

import java.util.Locale;

public class MultiDiv extends Operator {

    private final double[] nums = new double[2];

    public MultiDiv() {
        super("([^*/+-]-)?[0-9]+([.,][0-9]+)?[*/]-?[0-9]+([.,][0-9]+)?");
    }

    @Override
    public String getResult(String input) {
        boolean negative = input.charAt(0) == '-';
        if (negative) input = input.replaceFirst("-", "");

        String[] text = input.replace(',','.').split("[*/]", 2);
        nums[0] = Double.parseDouble((negative) ? "-" + text[0] : text[0]);
        nums[1] = Double.parseDouble(text[1]);
        switch (input.charAt(text[0].length())) {
            case '/': {
                if (nums[1] == 0) return "Бесконечность";
                return String.format(Locale.ENGLISH,"%.13f", nums[0] / nums[1]);
            }
            case '*': return String.format(Locale.ENGLISH,"%.13f", nums[0] * nums[1]);
        }
        return "Введённая строка не соответствует формату \"чисто оператор число\": " + input;
    }
}
