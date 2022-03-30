public class IfElseStatementTheme {
    public static void main(String[] args) {
        //1. Перевод псевдокода на язык Java
        System.out.println("1. Перевод псевдокода на язык Java\n");

        int age = 18;
        if (age > 20) {
            System.out.println("Зрелый возраст");
        } else {
            System.out.println("Юношеский возраст");
        }

        boolean man = false;
        if (!man) {
            System.out.println("Женщина");
        } else {
            System.out.println("Мужчина");
        }

        double height = 1.90;
        if (height < 1.80) {
            System.out.println("Средний рост");
        } else {
            System.out.println("Высокий рост");
        }

        var firstLetterName = "Helga".charAt(0);        
        if (firstLetterName == 'M') {
            System.out.println("Не правильно");
        } else if (firstLetterName == 'I') {
            System.out.println("Не правильно");            
        } else {
             System.out.println("Первая буква имени = " + firstLetterName);            
        }

        //2. Поиск максимального и минимального числа
        System.out.println("\n2. Поиск максимального и минимального числа\n");

        int number1 = 13;
        float number2 = 78.16F;
        if (number1 > number2) {
            System.out.println(" " + number1 + " > " + number2);
        } else {
            System.out.println(" " + number1 + " < " + number2);
        }

        //3. Работа с числом
        System.out.println("\n3. Работа с числом\n");

        int numberC = 651;
        if (numberC % 2 == 0) {
            System.out.println(numberC + " - чётное число");
        } else {
            System.out.println(numberC + " - нечётное число");
        }

        if (numberC > 0) {
            System.out.println(numberC + " - положительное число");
        } else {
            System.out.println(numberC + " - отрицательное число");
        }

        boolean isNumberC = numberC == 0;
        if (isNumberC == true) {
            System.out.println("Число " + numberC + " равно нулю");
        } else {
            System.out.println("Число " + numberC + " не равно нулю");
        }

        //4. Поиск общей цифры в числах
        System.out.println("\n4. Поиск общей цифры в числах\n");

        int numberX = 987;
        int numberY = 107;
        if (numberX / 100 == numberY / 100) {
            System.out.println("Совпадают цифры разряда сотни. Цифра: " + numberX / 100);
        } else if ((numberX / 10) % 10 == (numberY / 10) % 10) {
            System.out.println("Совпадают цифры разряда десятки. Цифра: " + (numberX / 10) % 10);
        } else if (numberX % 10 == numberY % 10) {
            System.out.println("Совпадают цифры разряда единицы. Цифра: " + numberX % 10);
        }

        //5. Определение буквы, числа или символа по их коду
        System.out.println("\n5. Определение буквы, числа или символа по их коду\n");

        char symbol = '\u005A';
        if (symbol > 64 && symbol <= 90 || symbol > 96 && symbol <= 122) {
            System.out.println("По коду определена буква: " + symbol);
        } else if (symbol > 47 && symbol <= 57) {
            System.out.println("По коду определена цифра: " + symbol);
        } else {
            System.out.println(symbol + " - Это не буква и не число");
        }

        //6. Определение суммы вклада и начисленных банком %
        System.out.println("\n6. Определение суммы вклада и начисленных банком %\n");

        double bankDeposit = 300000;
        double percent = 0;
        if (bankDeposit < 100000) {
            percent = 0.05;
        }  else if (bankDeposit > 100000 && bankDeposit < 300000) {
            percent = 0.07;
        } else {
            percent = 0.1;
        }

        System.out.println("Сумма вклада: " + bankDeposit + "\nНачисленный за год % = " + bankDeposit * percent + "\nИтоговая годовая сумма: " + (bankDeposit + bankDeposit * percent));        
        

        //7. Определение оценки по предметам
        System.out.println("\n7. Определение оценки по предметам\n");

        double historyPerсent = 59;
        double programmingPerсent = 91;
        double score1 = 0;
        double score2 = 0;
        
        if (historyPerсent > 91) {
            score1 = 5;
        } else if (historyPerсent > 73) {
            score1 = 4;
        } else if (historyPerсent > 60) {
            score1 = 3;
        } else if (historyPerсent <= 60) {
            score1 = 2;
        }
        
        if (programmingPerсent > 91) {
            score2 = 5;
        } else if (programmingPerсent > 73) {
            score2 = 4;
        } else if (programmingPerсent > 60) {
            score2 = 3;
        } else if (programmingPerсent <= 60) {
            score2 = 2;
        }
        
        System.out.println("История: " + score1 + "\nПрограммирование: " + score2);
        System.out.println("Средняя оценка: " + (score1 + score2) / 2 + "\nСредний процент по предметам: " + (historyPerсent + programmingPerсent) / 2 + "%\n");

        //8. Расчет прибыли (убытка)
        System.out.println("8. Расчет прибыли (убытка)\n");

        int rentCost = 5000;
        int monthlyRevenue = 15000;
        int costPrice = 9000;

        int netAnnualProfit = (monthlyRevenue - costPrice - rentCost) * 12;

        if (netAnnualProfit > 0) {
            System.out.println("Прибыль годовая = +" + netAnnualProfit);
        } else if (netAnnualProfit < 0) {
            System.out.println("Прибыль годовая = " + netAnnualProfit);
        } else {
            System.out.println("Прибыль годовая = 0");
        }

        //9. Определение существования треугольника
        System.out.println("\n9. Определение существования треугольника\n");

        double sideA = 3;
        double sideB = 4;
        double sideC = 5;

        if ((sideA + sideB > sideC) || (sideA + sideC > sideB) || (sideB + sideC > sideA)) {
            System.out.println("Такой треугольник существует");
        } else {
            System.out.println("Такой треугольник не существует");
        }

        double catet1 = 0;
        double catet2 = 0;
        
        if ((sideA > sideB) && (sideA > sideC)) {
            catet1 = sideB;
            catet2 = sideC;
        } else if ((sideB > sideA) && (sideB > sideC)) {
            catet1 = sideA;
            catet2 = sideC;
        } else {
            catet1 = sideA;
            catet2 = sideB;
        }
        
        System.out.println("Площадь треугольника равна " + (catet1 * catet2 / 2));

        char backslash = 92;
        char verticalBar = 124;
        char underscore = 95;

        System.out.println("\n     " + verticalBar + backslash);
        System.out.println("     " + verticalBar + " " + backslash);
        System.out.println("     " + verticalBar + " " + " " + backslash);
        System.out.println("     " + verticalBar + underscore + underscore + underscore + backslash + "\n");

        //10. Подсчет количества банкнот
        System.out.println("\n10. Подсчет количества банкнот\n");

        int sumMoney = 567;

        int denomination1 = 1;
        int denomination10 = 10;
        int denomination50 = 50;
        
        int nominal1 = sumMoney % denomination50 % denomination10;
        int nominal10 = (sumMoney % denomination50) / denomination10;
        int nominal50 = sumMoney / denomination50;
        
        System.out.println("Количество банкнот номиналом 50: " + nominal50 + " шт\n");
        System.out.println("Количество банкнот номиналом 10: " + nominal10 + " шт\n");
        System.out.println("Количество банкнот номиналом 1: " + nominal1 + " шт\n");
        System.out.println("Общее количество банкнот: " + (nominal1 + nominal10 + nominal50) + " шт\n");
        System.out.println("Исходная сумма: " + ((denomination1 * nominal1) + (denomination10 * nominal10) + (denomination50 * nominal50)) + " шт\n");
    }
}