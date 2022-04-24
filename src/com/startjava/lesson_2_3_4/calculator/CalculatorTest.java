package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        String choice;

        do {
            Scanner scanner  = new Scanner(System.in);
            Calculator calculator = new Calculator();

            System.out.println("Введите математическое выражение (через пробел): ");
            String mathExpression = scanner.nextLine();

            System.out.print(mathExpression + " = " + calculator.calc(mathExpression));

            do {
                System.out.println("\nХотите продолжить вычисления? [yes/no]:");
                choice = scanner.next();
            } while(!choice.equalsIgnoreCase("Yes") && !choice.equalsIgnoreCase("No"));
        } while (choice.equalsIgnoreCase("Yes"));
    }
}