package com.startjava.Lesson_1.Calculator;

public class Calculator{
    public static void main(String[] args) {
        double a = 15;
        double b = 2;
        double result = 0;
        char sign = '/';

        if (sign == '+') {
            result = a + b;
        } else if (sign == '-') {
            result = a - b;
        } else if (sign == '%') {
            result = a % b;
        } else if (sign == '*') {
            result = a * b;
        } else if (sign == '/') {
            result = a / b;
        } else if (sign == '^') {
            result = 1;
            for (int i = 1; i <= b; i++) {
                result *= a;
            }
        }
        System.out.println(a + " " + sign + " " + b + " = " + result);
    }
}