package com.axeplay.calculator.operators;

public class Exponent extends Operator {

    private double[] nums = new double[2];

    public Exponent() {
        super("-?[0-9]+([.,][0-9]+)?\\^-?[0-9]+([.,][0-9]+)?");
    }

    @Override
    public String getResult(String input) {
        String[] texts = input.split("\\^", 2);
        nums[0] = Double.parseDouble(texts[0]);
        nums[1] = Double.parseDouble(texts[1]);
        return Math.pow(nums[0], nums[1]) + "";
    }

}
