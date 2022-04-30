package com.startjava.lesson_2_3_4.game;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class GuessNumber {
    Scanner console = new Scanner(System.in);

    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void launch() {
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1;

        while (true) {
            //Счётчик попыток
            for(int i = 0; i < 10; i++) {
                // Введи число:
                inputNumber(player1);
                //Передача в массив
                player1.setAttemptNum(i);
                //Ввод числа с клавиатуры
                player1.setNumbers(console.nextInt());

                if (player1.getNumbesInt() > secretNumber) {
                    System.out.println("Данное число больше того, что загадал компьютер");
                } else if (player1.getNumbesInt() < secretNumber) {
                    System.out.println("Данное число меньше того, что загадал компьютер");
                } else {
                    System.out.println("Выиграл игрок " + player1.getName() + ", угадал число " + player1.getNumbesInt() + " c " + (player1.getAttemptNum() + 1) + " попытки.");
                    break;
                }
                //Проверка оставшегося количества попыток
                if (player1.getAttemptNum() == 9) {
                    System.out.println(player1.getName() + ", у Вас закончились попытки!");
                }

                //Введи число:
                inputNumber(player2);
                //Передача в массив
                player2.setAttemptNum(i);
                //Ввод числа с клавиатуры
                player2.setNumbers(console.nextInt());

                if (player2.getNumbesInt() > secretNumber) {
                    System.out.println("Данное число больше того, что загадал компьютер");
                } else if (player2.getNumbesInt() < secretNumber) {
                    System.out.println("Данное число меньше того, что загадал компьютер");
                } else {
                    System.out.println("Выиграл игрок " + player2.getName() + ", угадал число " + player2.getNumbesInt() + " c " + (player2.getAttemptNum() + 1) + " попытки.");
                    break;
                }
                //Проверка оставшегося количества попыток
                if (player2.getAttemptNum() == 9) {
                    System.out.println("Никто не угадал, Игра закончена!");
                    break;
                }
            }
            int[] copy1 = Arrays.copyOf(player1.getNumbers(), player1.getAttemptNum() + 1);
            int[] copy2 = Arrays.copyOf(player2.getNumbers(), player2.getAttemptNum() + 1);

            System.out.println("Игрок " + player1.getName() + " вводил следующие цифры: " + Arrays.toString(copy1));
            System.out.println("Игрок " + player2.getName() + " вводил следующие цифры: " + Arrays.toString(copy2));

            Arrays.fill(player1.getNumbers(), 0);
            Arrays.fill(player2.getNumbers(), 0);
            break;
        }
    }

    public void inputNumber(Player player) {
        System.out.println(player.getName() + ", введи число:");
    }
}