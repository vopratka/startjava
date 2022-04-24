package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private int result;
    public int calc(String mathExpression) {
        String[] elements = mathExpression.split(" ");
        int a = Integer.parseInt(elements[0]);
        char sign = elements[1].charAt(0);
        int b = Integer.parseInt(elements[2]);

        switch(sign) {
            case '+':
                return Math.addExact(a, b);
            case '-':
                return Math.subtractExact(a, b);
            case '%':
                return Math.floorMod(a, b);
            case '*':
                return Math.multiplyExact(a, b);
            case '/':
                return Math.floorDiv(a, b);
            case '^':
                return (int)Math.pow(a, b);
        }
        return result;
    }
}