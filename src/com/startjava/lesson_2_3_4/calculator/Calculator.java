package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private int a;
    private int b;
    private int result;
    private char sign;

    public int calc(String mathCombination) {
        String[] elements = mathCombination.split(" ");
        a = Integer.parseInt(elements[0]);
        sign = elements[1].charAt(0);
        b = Integer.parseInt(elements[2]);

        switch(sign) {
            case '+':
                result = Math.addExact(a, b);
                break;
            case '-':
                result = Math.subtractExact(a, b);
                break;
            case '%':
                result = Math.floorMod(a, b);
                break;
            case '*':
                result = Math.multiplyExact(a, b);
                break;
            case '/':
                result = Math.floorDiv(a, b);
                break;
            case '^':
                result = (int)Math.pow(a, b);
                break;
        }
        return result;
    }
}