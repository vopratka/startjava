public class CyclesTheme{
    public static void main(String[] args) {
        //1. Подсчет суммы четных и нечетных чисел
        System.out.println("1. Подсчет суммы четных и нечетных чисел: \n");
        
        int i = -10;
        int sumEvent = 0;
        int sumOdd = 0;

        do {
            if (i % 2 == 0) {
                sumEvent += i;
            } else {
                sumOdd += i;
            }
            i++;
        } while (i <= 21);
        
        System.out.println("Чётные: " + sumEvent);
        System.out.println("Нечётные: " + sumOdd);

        //2. Вывод чисел между max и min
        System.out.println("\n2. Вывод чисел между max и min: \n");
        
        int number1 = 10;
        int number2 = 5;
        int number3 = -1;
        
        int minnumber = 0;
        int maxnumber = 0;
        
        if (number1 < number2) {
            minnumber = number1;
            maxnumber = number2;
        } else{
            minnumber = number2;
            maxnumber = number1;
        }

        if (minnumber > number3) {
            minnumber = number3;
        } else {
            maxnumber = number3;
        }

        for (int j = maxnumber; j >= minnumber; j--) {
            System.out.println("Цифра: " + j);
        }


        //3. Вывод реверсивного числа и суммы его цифр
        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр\n");

        int num = 1234;
        int digit = 0;
        int sumNum = 0;

        while (num != 0) {
            digit = num % 10;
            num = num / 10;
            sumNum += digit; 
            System.out.print(digit);
        }
        System.out.println("\nСумма цифр = " + sumNum);

        //4. Вывод чисел на консоль в несколько строк
        System.out.println("\n4. Вывод чисел на консоль в несколько строк\n");

        int amountSymbol = 0;
        for (int j = 1; j < 25; j += 2) {
            if (amountSymbol == 5) {
                System.out.printf("%n%n");
                amountSymbol = 0;
            }            
            System.out.printf("%3s", j);
            amountSymbol++;
        }    
        if (amountSymbol < 5) {
            for (int k = 0; k < 5 - amountSymbol; k++) {
                System.out.printf("%3s", 0);
            }    
        }

        //5. Проверка количества единиц на четность
        System.out.println("\n\n5. Проверка количества единиц на четность\n");

        int count = 0;
        int number4 = 3141591;
        int number5 = number4 % 10;
        while (number4 != 0) {
            if (number4 % 10 == 1) {
                count++;
            }
            number4 /= 10;
        }
        if (count % 2 == 0) {
            System.out.println("Количество единиц = " + count + " - Чётное число\n");
        } else {
            System.out.println("Количество единиц = " + count + " - Нечётное число\n");
        }

        //6. Отображение фигур в консоли
        System.out.println("6. Отображение фигур в консоли\n");

        char symbol1 = 42;
        for (int j = 0; j < 50; j++) {
            if (j % 10 == 0) {
                System.out.print("\n");
            } 
            System.out.print(symbol1);
        }

        System.out.println("\n");

        char symbol2 = 35;
        int num1 = 5;
        int num2 = 5;
        while (num1 > 0) {
            while (num2 > 0) {
                System.out.print(symbol2);
                num2--;
            }
            System.out.println("");
            num1--;
            num2 = num1;
        }

        System.out.println("\n");

        char symbol3 = 36;
        int num3 = -2;
        int num4 = 0;
        System.out.println(symbol3); //Не нашёл другого решения. Прошу помощи.
        do {
            do {
                num4++;
                System.out.print(symbol3);
            } while (num4 < 2);
            System.out.println("");
            num3++;
            num4 = num3;
        } while (num3 < 2);

        //7. Отображение ASCII-символов
        System.out.println("\n7. Отображение ASCII-символов\n");
        char symbol = 0;
        for (int j = 1; j < 2; j++) {
            System.out.println("DEC " + "Char");
            for (int k = 0; k <= 127; k++) {
                if (k < 10) {
                    System.out.println(k + "   " + symbol);
                } else if (k < 100) {
                    System.out.println(k + "  " + symbol);
                } else {
                    System.out.println(k + " " + symbol);
                }
            symbol++;
            }
        }

        //8. Проверка, является ли число палиндромом
        System.out.println("\n8. Проверка, является ли число палиндромом\n");

        int x = 12321;
        int x1 = x;
        int x2 = 0;
        while (x / 1 != 0) {
            x2 = x2 * 10;
            x2 = x2 + x % 10;
            x = x / 10;
        }
        if (x1 == x2) {
            System.out.println("Число " + x1 + " является палиндромом.");
        } else {
            System.out.println("Число " + x1 + " не является палиндромом.");
        }

        //9. Определение, является ли число счастливым
        System.out.println("\n9. Определение, является ли число счастливым\n");

        int y = 153842;
        int y1 = 0;
        int y2 = 0;
        int y3 = 0;

        int y4 = y / 1000;
        int y5 = 0;
        int y6 = 0;
        int y7 = 0;


        do {
            y3++;
            y1 = y % 10;
            y = y / 10;
            y2 = y2 + y1;
            System.out.print(y1);
            if (y3 < 3) {
                System.out.print(" + ");
            }
            } while (y3 < 3);
        System.out.println(" = " + y2);

        do {
            y7++;
            y5 = y4 % 10;
            y4 = y4 / 10;
            y6 = y6 + y5;
            System.out.print(y5);
            if (y7 < 3) {
                System.out.print(" + ");
            }
            } while (y7 < 3);
        System.out.println(" = " + y6);

        if (y2 == y6) {
            System.out.println("Число является счастливым");
        } else {
            System.out.println("Число не является счастливым");
        }


        //10. Вывод таблицы умножения Пифагора
        System.out.println("\n10. Вывод таблицы умножения Пифагора\n");

        int k = 2;
        int j = 0;

        System.out.print("   ");
        while (k < 10) {
            System.out.print(" " + k + " ");
            k++;
        }
        System.out.println("");
        for (k = 2; k < 10; k++) {
            System.out.print(" " + k + " ");
            for (j = 2; j < 10; j++) {
                if (k * j < 10) {
                    System.out.print(" " + k * j + " ");
                } else {
                    System.out.print(k * j + " ");
                }
            }
            System.out.println("");
        }
    }
}