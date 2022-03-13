public class IfElseStatementTheme {
    public static void main(String[] args) {

        //1. Перевод псевдокода на язык Java

        System.out.println("1. Перевод псевдокода на язык Java\n");

        int age = 18;
        if (age > 20) {
            System.out.println(" Зрелый возраст");
        } else {
            System.out.println(" Юношеский возраст");
        }

        boolean man = false;
        if (!man) {
            System.out.println(" Женщина");
        } else {
            System.out.println(" Мужчина");
        }

        double growth = 1.90;
        if (growth < 1.80) {
            System.out.println(" Средний рост");
        } else {
            System.out.println(" Высокий рост");
        }

        var firstLetterName = "Helga".charAt(0);        
        if (firstLetterName == 'M') {
            System.out.println(" Не правильно");
        } else if (firstLetterName == 'I') {
            System.out.println(" Не правильно");            
        } else {
             System.out.println(" Первая буква имени = " + firstLetterName);            
        }

        //2. Поиск максимального и минимального числа

        System.out.println("\n2. Поиск максимального и минимального числа\n");

        int numberA = 13;
        float numberB = 78.16F;
        if (numberA > numberB) {
            System.out.println(" " + numberA + " > " + numberB);
        } else {
            System.out.println(" " + numberA + " < " + numberB);
        }

        //3. Работа с числом

        System.out.println("\n3. Работа с числом\n");

        int numberC = 651;
        if (numberC % 2 == 0) {
            System.out.println(" " + numberC + " - чётное число");
        } else {
            System.out.println(" " + numberC + " - нечётное число");
        }

        //4. Поиск общей цифры в числах

        System.out.println("\n4. Поиск общей цифры в числах\n");

        int numberX = 987;
        int numberY = 107;
        if (numberX / 100 == numberY / 100) {
            System.out.println(" Совпадают цифры разряда сотни. Цифра: " + numberX / 100);
        } else if ((numberX / 10) % 10 == (numberY / 10) % 10) {
            System.out.println(" Совпадают цифры разряда десятки. Цифра: " + (numberX / 10) %10);
        } else if (numberX % 10 == numberY % 10) {
            System.out.println(" Совпадают цифры разряда единицы. Цифра: " + numberX %10);
        }

        //5. Определение буквы, числа или символа по их коду

        System.out.println("\n5. Определение буквы, числа или символа по их коду\n");

        char symbol = '\u005A';
        if (Character.isDigit(symbol)) {
            System.out.println(" По коду определена цифра: " + symbol);
        } else if (Character.isLetter(symbol)) {
        System.out.println(" По коду определена буква: " + symbol);            
        } else {
            System.out.println(" Это не буква и не число");
        }

        //6. Определение суммы вклада и начисленных банком %

        System.out.println("\n6. Определение суммы вклада и начисленных банком %\n");

        int bankDeposit = 300000;

        System.out.println(" Сумма вклада: " + bankDeposit + "\n");
        if (bankDeposit < 100000) {
            System.out.println(" 5% годовых при вкладе до 100000.\n Начисленный за год % = " + bankDeposit * 0.05 + "\n Итоговая годовая сумма: " + bankDeposit * 1.05);
        } else if (bankDeposit > 100000 & bankDeposit < 300000) {
            System.out.println(" 7% годовых при вкладе от 100000 до 300000.\n Начисленный за год % = " + bankDeposit * 0.07 + "\n Итоговая годовая сумма: " + bankDeposit * 1.07);
        } else {
             System.out.println(" 10% годовых при вкладе от 300000.\n Начисленный за год % = " + bankDeposit * 0.1 + "\n Итоговая годовая сумма: " + bankDeposit * 1.1);
        }

        //7. Определение оценки по предметам

        System.out.println("\n7. Определение оценки по предметам\n");

        float historyPerсent = 59F;
        float programmingPerсent = 91F;

        if (historyPerсent > 91) {
            System.out.println(" 5 - История");
        } else if (historyPerсent > 73) {
            System.out.println(" 4 - История");
        } else if (historyPerсent > 60) {
            System.out.println(" 3 - История");
        } else if (historyPerсent <= 60) {
            System.out.println(" 2 - История");
        }

        if (programmingPerсent > 91) {
            System.out.println(" 5 - Программирование");
        } else if (programmingPerсent > 73) {
            System.out.println(" 4 - Программирование");
        } else if (programmingPerсent > 60) {
            System.out.println(" 3 - Программирование");
        } else if (programmingPerсent <= 60) {
            System.out.println(" 2 - Программирование");
        }

        if (historyPerсent <= 60 & programmingPerсent > 73) {
            System.out.println(" Средний балл оценок по предметам: " + (2 + 4) / 2);
        }

        System.out.println("\n Средний процент по предметам: " + (historyPerсent + programmingPerсent) / 2 + "%\n");

        //8. Расчет прибыли (убытка)

        System.out.println("\n8. Расчет прибыли (убытка)\n");

        int rentCost = 5000;
        int monthlyRevenue = 15000;
        int costPrice = 9000;

        int netMonthlyIncome = monthlyRevenue - costPrice - rentCost;

        if (netMonthlyIncome > 0) {
            System.out.println(" Прибыль годовая = +" + netMonthlyIncome * 12);
        } else if (netMonthlyIncome < 0) {
            System.out.println(" Прибыль годовая = " + netMonthlyIncome * 12);
        } else {
            System.out.println(" Прибыль годовая = 0");
        }

        //9. Определение существования треугольника

        System.out.println("\n9. Определение существования треугольника\n");

        char backslash, verticalBar, underscore;
        backslash = 92;
        verticalBar = 124;
        underscore = 95;


        System.out.println("     " + verticalBar + backslash);
        System.out.println("     " + verticalBar + " " + backslash);
        System.out.println("     " + verticalBar + " " + " " + backslash);
        System.out.println("     " + verticalBar + underscore + underscore + underscore + backslash + "\n");

        int sideA = 3;
        int sideB = 4;
        int sideC = 5;
        int sumSquaresLegs = sideA * sideA + sideB * sideB;
        int squareHypotenuse = sideC * sideC;

        if (sumSquaresLegs == squareHypotenuse) {
            System.out.println(" Такой треугольник существует");
        } else {
            System.out.println(" Такой треугольник не существует");
        }

        System.out.println("\n Площадь треугольника равна: " + sideA * sideB / 2);

        //10. Подсчет количества банкнот

        System.out.println("\n10. Подсчет количества банкнот\n");

        int sumMoney = 567;

        int denomination1 = 1;
        int denomination2 = 10;
        int denomination3 = 50;



        System.out.println(" Количество банкнот номиналом 50: " + sumMoney / denomination3 + " шт");
        System.out.println(" Количество банкнот номиналом 10: " + (sumMoney % denomination3 / denomination2) + " шт");
        System.out.println(" Количество банкнот номиналом 1: " + (sumMoney % denomination3 % denomination2) + " шт");

        System.out.print(" Общее количество банкнот: ");
        System.out.println(sumMoney / denomination3 + sumMoney % denomination3 / denomination2 + sumMoney % denomination3 % denomination2 + " шт\n");

        System.out.print(" Исходная сумма : ");
        System.out.println(denomination2 * (sumMoney % denomination3 / denomination2) + denomination3 * (sumMoney / denomination3) + denomination1 * (sumMoney % denomination3 % denomination2));
    }
} 