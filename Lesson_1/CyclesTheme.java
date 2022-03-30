public class CyclesTheme {
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
        
        int number1 = 9;
        int number2 = 5;
        int number3 = 0;
        
        int minNumber = number1;
        int maxNumber = number2;
        
        if (minNumber > maxNumber) {
            minNumber = maxNumber;
            maxNumber = number1;
        }

        if (minNumber > number3) {
            minNumber = number3;
        } else {
            maxNumber = number3;
        } 

        for (int j = maxNumber; j >= minNumber; j--) {
            System.out.println("Цифра: " + j);
        }

        //3. Вывод реверсивного числа и суммы его цифр
        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр\n");

        int srcNum = 1234;
        int digit = 0;
        int sumDigits = 0;

        while (srcNum != 0) {
            digit = srcNum % 10;
            srcNum /= 10;
            sumDigits += digit; 
            System.out.print(digit);
        }
        System.out.println("\nСумма цифр = " + sumDigits);

        //4. Вывод чисел на консоль в несколько строк
        System.out.println("\n4. Вывод чисел на консоль в несколько строк\n");

        int counter = 0;
        for (int j = 1; j < 25; j += 2) {
            if (counter == 5) {
                System.out.printf("%n%n");
                counter = 0;
            }            
            System.out.printf("%3s", j);
            counter++;
        }    
        if (counter < 5) {
            for (int k = 0; k < 5 - counter; k++) {
                System.out.printf("%3s", 0);
            }    
        }

        //5. Проверка количества единиц на четность
        System.out.println("\n\n5. Проверка количества единиц на четность\n");

        int count = 0;
        srcNum = 3141591;
        while (srcNum != 0) {
            if (srcNum % 10 == 1) {
                count++;
            }
            srcNum /= 10;
        }
        if (count % 2 == 0) {
            System.out.println("Количество единиц = " + count + " - Чётное число\n");
        } else {
            System.out.println("Количество единиц = " + count + " - Нечётное число\n");
        }

        //6. Отображение фигур в консоли
        System.out.println("6. Отображение фигур в консоли\n");

        for (int j = 0; j < 50; j++) {
            if (j % 10 == 0) {
                System.out.print("\n");
            } 
            System.out.print("*");
        }

        System.out.println("\n");

        int j = 5;
        i = 5;
        while (i > 0) {
            while (j > 0) {
                System.out.print("#");
                j--;
            }
            System.out.println();
            j = --i;
        }

        System.out.println("\n");

        i = -2;
        j = 0;
        System.out.println("$");
        do {
            do {
                j++;
                System.out.print("$");
            } while (j < 2);
            System.out.println();
            i++;
            j = i;
        } while (i < 2);

        //7. Отображение ASCII-символов
        System.out.println("\n7. Отображение ASCII-символов\n");
        char symbol = 0;
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

        //8. Проверка, является ли число палиндромом
        System.out.println("\n8. Проверка, является ли число палиндромом\n");

        int expectedNum = 12321;
        int actualNum = expectedNum;
        int x2 = 0;
        while (expectedNum / 1 != 0) {
            x2 *= 10;
            x2 += expectedNum % 10;
            expectedNum /= 10;
        }
        if (actualNum == x2) {
            System.out.println("Число " + actualNum + " является палиндромом.");
        } else {
            System.out.println("Число " + actualNum + " не является палиндромом.");
        }

        //9. Определение, является ли число счастливым
        System.out.println("\n9. Определение, является ли число счастливым\n");
        
        int randomNum = 153842;
        int digitNum = 0;
        int firstPartNumber = 0;
        int sumthreeNum = 0;
        int sumSecondThree = 0;
        int secondPartNumber = 0;

        for (i = 0; i < 6; i++) {
            digitNum = randomNum % 10;
            randomNum /= 10;
            
            if (randomNum / 100 != 0) {
                firstPartNumber++;
                sumthreeNum += digitNum;
                System.out.print(digitNum);
                if (firstPartNumber < 3) {
                    System.out.print(" + ");
                } else if (firstPartNumber == 3) {
                    System.out.println(" = " + sumthreeNum);
                }
            } else {
                secondPartNumber++;
                sumSecondThree += digitNum;
                System.out.print(digitNum);
                if (secondPartNumber < 3) {
                    System.out.print(" + ");
                } else if (secondPartNumber == 3) {
                    System.out.println(" = " + sumSecondThree);
                }
            }
        }
        if (sumthreeNum == sumSecondThree) {
            System.out.println("Число является счастливым");
        } else {
            System.out.println("Число не является счастливым");
        }

        //10. Вывод таблицы умножения Пифагора
        System.out.println("\n10. Вывод таблицы умножения Пифагора\n");

        int k = 2;
        j = 0;

        System.out.print("   ");
        while (k < 10) {
            System.out.print(" " + k + " ");
            k++;
        }
        System.out.println();
        for (k = 2; k < 10; k++) {
            System.out.print(" " + k + " ");
            for (j = 2; j < 10; j++) {
                if (k * j < 10) {
                    System.out.print(" " + k * j + " ");
                } else {
                    System.out.print(k * j + " ");
                }
            }
            System.out.println();
        }
    }
}