import java.util.Scanner;
public class CalculatorTest {
    public static void main(String[] args) {
    Calculator calculator = new Calculator();
    Scanner scanner  = new Scanner(System.in);
    String choice;
    do {
        System.out.println("Введите первое число: ");
        calculator.setA(scanner.nextDouble());

        System.out.println("Введите знак математической операции: ");
        calculator.setSign(scanner.next().charAt(0));

        System.out.println("Введите второе число: ");
        calculator.setB(scanner.nextDouble());

        System.out.println("Результат: " + calculator.getA() + " " + calculator.getSign() + " " + calculator.getB() + " = " + calculator.calc());

        choice = "";
        while((!choice.equalsIgnoreCase("Yes")) && (!choice.equalsIgnoreCase("No"))) {
            System.out.println("Хотите продолжить вычисления? [yes/no]:");
            choice = scanner.next();
        }
    } while (choice.equalsIgnoreCase("Yes"));
    }
}