public class VariablesTheme {
    public static void main(String[] args) {
        /*Создание переменных и вывод их значений на консоль*/
        
        // Число процессоров ПК:
        byte proc = 1;

        // Частота процессора МГц:
        short rate = 3701;

        // Объём оперативной памяти, Mb:
        int memory = 32672;

        // Объём жёсткого диска, b:
        long volume = 16887000000000L;

        // Скорость Ethernet-контроллера, GbE:
        float speed = 2.5F;

        // Объём жёсткого диска, Мb:
        double volMb = volume / 1000000;

        // Буква системного диска:
        char lit = 67;

        // Объём жёсткого диска больше объёма оперативной памяти:
        boolean more = volMb > memory; // true

        System.out.println("1. Создание переменных и вывод их значений на консоль");
        System.out.println("");

        System.out.print("Число процессоров ПК: ");
        System.out.println(proc);

        System.out.print("Частота процессора МГц: ");
        System.out.println(rate);

        System.out.print("Объём оперативной памяти, Mb: ");
        System.out.println(memory);

        System.out.print("Объём жёсткого диска, b: ");
        System.out.println(volume);

        System.out.print("Скорость Ethernet-контроллера, GbE: ");
        System.out.println(speed);

        System.out.print("Объём жёсткого диска, Мb: ");
        System.out.println(volMb);

        System.out.print("Буква системного диска: ");
        System.out.println(lit);

        System.out.print("Объём жёсткого диска больше объёма оперативной памяти: ");
        System.out.println(more);
        System.out.println("");
        
        /*Расчет стоимости товара со скидкой*/
        
        // товар x стоит 100 руб:
        int x = 100;
        
        // товар y стоит 200 руб:
        int y = 200;
        
        //Общая стоимость товаров:
        int totCost = x + y;
        
        // скидка на общую покупку 11%:
        double sale = 0.11;
        
        // Сумма скидки:
        double sumSale = totCost * sale;
        
        // Стоимость товаров со скидкой:
        double sumPrice = totCost - sumSale;
        
        System.out.println("2. Расчет стоимости товара со скидкой");
        System.out.println("");
        
        System.out.print("Стоимость товаров со скидкой: ");
        System.out.print(sumPrice);
        System.out.println(" руб.");
        
        System.out.print("Сумма скидки: ");
        System.out.print(sumSale);
        System.out.println(" руб.");
        System.out.println("");
        
        /*Вывод на консоль слова JAVA*/
        System.out.println("3. Вывод на консоль слова JAVA:");
        System.out.println("");
        
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println("              l");
        System.out.println("");
        
        /*Отображение min и max значений числовых типов данных*/
        
        byte bt = 127;
        short st = 32767;
        int it = 2147483647;
        long lg = 9223372036854775807L;
        
        //Инкремент на 1:        
        int btPl = bt + 1; // типы byte и short выдают ошибку
        int stPl = st + 1; // типы byte и short выдают ошибку
        int itPl = it + 1;
        long lgPl = lg + 1;
        
        //Декремент на 1:        
        int btMn = bt - 1; // типы byte и short выдают ошибку
        int stMn = st - 1; // типы byte и short выдают ошибку
        int itMn = it - 1;
        long lgMn = lg - 1;
        
        System.out.println("4. Отображение min и max значений числовых типов данных:");
        System.out.println("");
        
        System.out.println(bt);
        System.out.println(st);
        System.out.println(it);
        System.out.println(lg);
        System.out.println("");
        
        //Инкремент на 1, вывод:
        System.out.println("4.1 Инкремент на 1:");
        System.out.println("");
        
        System.out.println(btPl);
        System.out.println(stPl); 
        System.out.println(itPl);
        System.out.println(lgPl);
        System.out.println("");

        //Декремент на 1, вывод:
        System.out.println("4.2 Декремент на 1:");
        System.out.println("");
        
        System.out.println(btMn);
        System.out.println(stMn); 
        System.out.println(itMn);
        System.out.println(lgMn);
        System.out.println("");
        
        /*Перестановка значений переменных*/
        
        float a = 6;
        float b = 8;
        float c = b - a;
        
        System.out.println("5. Перестановка значений переменных:");
        System.out.println("");
        
        System.out.print("a = ");
        System.out.println(a);
        System.out.print("b = ");
        System.out.println(b);
        System.out.println("");
        
        System.out.println("   Результат замены:");
        System.out.println("");
        
        System.out.print("a = ");
        System.out.println(a + c);

        System.out.print("b = ");
        System.out.println(b - c);
        System.out.println("");

        /*Вывод символов и их кодов*/

        // Переменные:
        byte num1 = 35;
        byte num2 = 38;
        byte num3 = 64;
        byte num4 = 94;
        byte num5 = 95;
       
        System.out.println("6. Вывод символов и их кодов:");
        System.out.println("");

        System.out.println(num1 + " - " + (char) num1);
        System.out.println(num2 + " - " + (char) num2);
        System.out.println(num3 + " - " + (char) num3);
        System.out.println(num4 + " - " + (char) num4);
        System.out.println(num5 + " - " + (char) num5);
        System.out.println("");

        /*Произведение и сумма цифр числа*/

        System.out.println("7. Произведение и сумма цифр числа 345:");
        System.out.println("");

        System.out.println("Произвдение цифр числа 345 = " + ((345 / 100) * ((345 / 10) % 10) * (345 % 10)));
        System.out.println("");
        System.out.println("Сумма цифр числа 345 = " + ((345 / 100) + ((345 / 10) % 10) + (345 % 10)));
        System.out.println("");
        
        /*Вывод на консоль ASCII-арт Дюка*/
        
        System.out.println("8. Вывод на консоль ASCII-арт Дюка:");
        System.out.println("");
        
        char duk1 = 32;
        char duk2 = 47;
        char duk3 = 92;
        char duk4 = 95;
        char duk5 = 40;
        char duk6 = 41;

        // 4 пробела
        for (int i = 0; i < 4; i++) {
            System.out.print(duk1);
        }
        
        // прямой и обратный slash
        System.out.print(duk2);
        System.out.println(duk3);

        // 3 пробела
        for (int i = 0; i < 3; i++) {
            System.out.print(duk1);
        }
        
        // прямой slash
        System.out.print(duk2);
        
        // 2 пробела
        for (int i = 0; i < 2; i++) {
            System.out.print(duk1);
        }
        
        // обратный slash
        System.out.println(duk3);

        // 2 пробела
        for (int i = 0; i < 2; i++) {
            System.out.print(duk1);
        }

        // прямой slash
        System.out.print(duk2);
        
        // нижнее подчёркивание
        System.out.print(duk4);
        
        // Открывающая скобка
        System.out.print(duk5);
        
        // пробел
        System.out.print(duk1);
        
        // Закрывающая скобка
        System.out.print(duk6);

        // обратный slash
        System.out.println(duk3);
        
        // пробел
        System.out.print(duk1);
        
        // прямой slash
        System.out.print(duk2);
        
        // 6 пробелов
        for (int i = 0; i < 6; i++) {
            System.out.print(duk1);
        }
        
        // обратный slash
        System.out.println(duk3);        

        // прямой slash
        System.out.print(duk2);
        
         // 4 нижних подчёркиваний
        for (int i = 0; i < 4; i++) {
            System.out.print(duk4);
        }

        // прямой slash
        System.out.print(duk2);
        
        // обратный slash
        System.out.print(duk3);
        
        // 2 нижних подчёркивания
        for (int i = 0; i < 2; i++) {
            System.out.print(duk4);
        }
        
        // обратный slash
        System.out.println(duk3);
        System.out.println("");
        
        /*Отображение сотен, десятков, единиц числа*/
        
        byte numer = 123;

        System.out.println("9. Отображение сотен, десятков, единиц числа 123:");
        System.out.println("");

        System.out.println("Сотни: " + (123 / 100));
        System.out.println("Десятки: " + ((123 / 10) % 10));
        System.out.println("Единицы: " + (123 % 10));        
        System.out.println("");
        
        //Преобразование секунд

        int sec = 86399;
        
        //Часы:
        int hour = sec / 3600;
        
        //Минуты:
        int minut = (sec - hour * 3600) / 60;
        
        //Секунды:
        int second = sec - hour * 3600 - minut * 60;
        
        System.out.println("10. Преобразование секунд:");
        System.out.println("");
        
        System.out.println(hour + ":" + minut + ":" + second);
        
    }
}