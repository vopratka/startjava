package com.startjava.lesson_2_3_4.game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    Scanner console = new Scanner(System.in);

    private Player player1;
    private Player player2;

    private int secretNumber;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void launch() {
        Random random = new Random();
        secretNumber = random.nextInt(100) + 1;

        while (true) {
            //Счётчик попыток
            for(int i = 0; i < 10; i++) {
                // Ввод числа первым игроком и передача в массив:
                inputNumber(i, player1);
                //Проверка результата первого игрока
                compareNumbers(player1);
                if (player1.getLastNum() == secretNumber) {
                    break;
                }
                //Проверка оставшегося количества попыток первого игрока
                checkAttempt(player1);
                // Ввод числа вторым игроком и передача в массив:
                inputNumber(i, player2);
                //Проверка результата второго игрока
                compareNumbers(player2);
                if (player2.getLastNum() == secretNumber) {
                    break;
                }
                //Проверка оставшегося количества попыток второго игрока
                checkAttempt(player2);
            }
            //Вывод чисел, которые использовал игрок 1
            playedNumbers(player1);
            //Вывод чисел, которые использовал игрок 2
            playedNumbers(player2);
            System.out.println();

            player1.resetArray();
            player2.resetArray();
            break;
        }
    }

    private void inputNumber(int i, Player player) {
        System.out.println(player.getName() + ", введи число:");
        player.setAttemptNum(i);
        //Ввод числа с клавиатуры
        player.setNumber(console.nextInt());
    }

    private boolean compareNumbers(Player player) {
        if (player.getLastNum() == secretNumber) {
            System.out.print("Выиграл игрок " + player.getName() + ", угадал число " + player.getLastNum());
            System.out.println(" c " + (player.getAttemptNum() + 1) + " попытки.");
            return true;
        }

        if (player.getLastNum() > secretNumber) {
            System.out.println("Данное число больше того, что загадал компьютер");
        } else if (player.getLastNum() < secretNumber) {
            System.out.println("Данное число меньше того, что загадал компьютер");
        }
        return false;
    }

    //Проверка оставшегося количества попыток
    public void checkAttempt(Player player) {
        if (player.getAttemptNum() == 9) {
            System.out.println(player.getName() + ", у Вас закончились попытки!");
        }
    }

    //Вывод чисел, которые использовали игроки
    private void playedNumbers(Player player) {
        System.out.print("\nИгрок " + player.getName() + " вводил следующие цифры: ");
        for (int number : player.getNumbers()) {
            System.out.print(" " + number);
        }
    }
}