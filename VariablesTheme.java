public class VariablesTheme {
    public static void main(String[] args) {
        //Создание переменных и вывод их значений на консоль

        System.out.println("1. Создание переменных и вывод их значений на консоль \n");

        byte numberOfCPU = 1;       
        System.out.println("Число процессоров ПК: " + numberOfCPU);

        short frequencyCPU = 3701;      
        System.out.println("Частота процессора МГц: " + frequencyCPU);

        int amountRamMb = 32672;
        System.out.println("Объём оперативной памяти, Mb: " + amountRamMb);

        long spaceHdB = 16887000000000L;
        System.out.println("Объём жёсткого диска, b: " + spaceHdB);

        float ethernetControllerSpeed = 2.5F;
        System.out.println("Скорость Ethernet-контроллера, GbE: " + ethernetControllerSpeed);

        double spaceHdMb = spaceHdB / 1000000;
        System.out.println("Объём жёсткого диска, Мb: " + spaceHdMb);

        char literaHd = 67;
        System.out.println("Буква системного диска: " + literaHd);

        boolean spaceHdMore = spaceHdMb > amountRamMb; // true
        System.out.println("Объём жёсткого диска больше объёма оперативной памяти: " + spaceHdMore);

        //Расчет стоимости товара со скидкой
        
        int priceX = 100;        
        int priceY = 200;
        int totalCost = priceX + priceY;
        double sale = 0.11;

        System.out.println("\n2. Расчет стоимости товара со скидкой\n");

        double sumSale = totalCost * sale;
        double sumPrice = totalCost - sumSale;        
        System.out.println("Стоимость товаров со скидкой: " + sumPrice + " руб.");
        System.out.println("Сумма скидки: " + sumSale + " руб.\n");

        //Вывод на консоль слова JAVA
        
        System.out.println("3. Вывод на консоль слова JAVA:\n");
        
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a\n");
        
        //Отображение min и max значений числовых типов данных

        System.out.println("4. Отображение min и max значений числовых типов данных:\n");
        
        byte variableByte = 127;
        System.out.println(variableByte);
        
        short variableShort = 32767;        
        System.out.println(variableShort);

        int variableInt = 2147483647;        
        System.out.println(variableInt);
        
        long variableLong = 9223372036854775807L;        
        System.out.println(variableLong);
        
        //Инкремент на 1, вывод:
        System.out.println("\n4.1 Инкремент на 1:\n");
        
        System.out.println(variableByte++);
        System.out.println(variableShort++);
        System.out.println(variableInt++);
        System.out.println(variableLong++);

        //Декремент на 1, вывод:
        System.out.println("\n4.2 Декремент на 1:\n");
        
        System.out.println(variableByte--);
        System.out.println(variableShort--);
        System.out.println(variableInt--);
        System.out.println(variableLong--);
        
        //Перестановка значений переменных

        System.out.println("\n5. Перестановка значений переменных:\n");
        
        float a = 6;        
        System.out.println("a = " + a);
        
        float b = 8;
        System.out.println("b = " + b);
        
        float c = b - a;

        System.out.println("\n   Результат замены:\n");
        System.out.println("a = " + (a + c));
        System.out.println("b = " + (b - c));

        //Вывод символов и их кодов

        System.out.println("\n6. Вывод символов и их кодов:\n");

        byte lattice = 35;
        System.out.println(lattice + " - " + (char) lattice);
        
        byte ampersand = 38;
        System.out.println(ampersand + " - " + (char) ampersand);
        
        byte at = 64;        
        System.out.println(at + " - " + (char) at);
        
        byte caret = 94;        
        System.out.println(caret + " - " + (char) caret);
        
        byte underline = 95;        
        System.out.println(underline + " - " + (char) underline);

        //Произведение и сумма цифр числа

        System.out.println("\n7. Произведение и сумма цифр числа 345:\n");

        System.out.println("Произвдение цифр числа 345 = " + ((345 / 100) * ((345 / 10) % 10) * (345 % 10)));

        System.out.println("\nСумма цифр числа 345 = " + ((345 / 100) + ((345 / 10) % 10) + (345 % 10)));

        //Вывод на консоль ASCII-арт Дюка

        char space, slash, reverseSlash, underscore, openBracket, closingBracket;

        space = 32;
        slash = 47;
        reverseSlash = 92;

        System.out.println("\n8. Вывод на консоль ASCII-арт Дюка:\n\n" + space + space + space + space + slash + reverseSlash);
        System.out.println("" + space + space + space + slash + space + space + reverseSlash);

        underscore = 95;        
        openBracket = 40;
        closingBracket = 41;

        System.out.println("" + space + space + slash + underscore + openBracket + space + closingBracket + reverseSlash);
        System.out.println("" + space + slash + space + space + space + space + space + space + reverseSlash);
        System.out.println("" + slash + underscore + underscore + underscore + underscore + slash + reverseSlash + underscore + underscore + reverseSlash);

        //Отображение сотен, десятков, единиц числа
        
        System.out.println("\n9. Отображение сотен, десятков, единиц числа 123:\n");

        byte numer = 123;
        System.out.println("Сотни: " + (123 / 100));
        System.out.println("Десятки: " + ((123 / 10) % 10));
        System.out.println("Единицы: " + (123 % 10));        

        //Преобразование секунд

        System.out.println("\n10. Преобразование секунд:\n");

        int sec = 86399;
        int hour = sec / 3600;
        int minut = (sec - hour * 3600) / 60;
        int second = sec - hour * 3600 - minut * 60;
        System.out.println(hour + ":" + minut + ":" + second);
    }
}