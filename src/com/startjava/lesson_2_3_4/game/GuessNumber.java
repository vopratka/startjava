package com.startjava.lesson_2_3_4.game;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class GuessNumber {
    Scanner console = new Scanner(System.in);

    private Player player1;
    private Player player2;
    int i;
    int secretNumber;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void launch() {
        Random random = new Random();
        secretNumber = random.nextInt(100) + 1;

        while (true) {
            //Счётчик попыток
            for(i = 0; i < 10; i++) {
                // Ввод числа первым игроком и передача в массив:
                inputNumber(player1);
                //Проверка результата первого игрока
                checkResult(player1);
                if (player1.getLastNum() == secretNumber) {
                    break;
                }
                //Проверка оставшегося количества попыток первого игрока
                checkAttempt(player1);
                // Ввод числа вторым игроком и передача в массив:
                inputNumber(player2);
                //Проверка результата второго игрока
                checkResult(player2);
                if (player2.getLastNum() == secretNumber) {
                    break;
                }
                //Проверка оставшегося количества попыток второго игрока
                checkAttempt(player2);
            }
            //Вывод чисел, которые использовал игрок 1
            System.out.print("\nИгрок " + player1.getName() + " вводил следующие цифры: ");
            copy(player1);
            //Вывод чисел, которые использовал игрок 2
            System.out.print("\nИгрок " + player2.getName() + " вводил следующие цифры: ");
            copy(player2);
            System.out.println();

            player1.getZero();
            player2.getZero();
            break;
        }
    }
    private void inputNumber(Player player) {
        System.out.println(player.getName() + ", введи число:");
        player.setAttemptNum(i);
        //Ввод числа с клавиатуры
        player.setNumber(console.nextInt());
    }
    private void checkResult(Player player) {
        if (player.getLastNum() > secretNumber) {
            System.out.println("Данное число больше того, что загадал компьютер");
        } else if (player.getLastNum() < secretNumber) {
            System.out.println("Данное число меньше того, что загадал компьютер");
        } else {
            System.out.println("Выиграл игрок " + player.getName() + ", угадал число " + player.getLastNum() + " c " + (player.getAttemptNum() + 1) + " попытки.");
        }
    }
    //Проверка оставшегося количества попыток
    public void checkAttempt(Player player) {
        if (player.getAttemptNum() == 9) {
            System.out.println(player.getName() + ", у Вас закончились попытки!");
        }
    }
    //Вывод чисел, которые использовали игроки
    private void copy(Player player) {
        for (int numbers : player.getNumber()) {
            System.out.print(" " + numbers);
        }
    }
}