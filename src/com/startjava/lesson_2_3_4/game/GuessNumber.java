package com.startjava.lesson_2_3_4.game;

import java.util.Random;
import java.util.Scanner;

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
        outer://Якорь выхода из цикла
        while (true) {
            
            for(int i = 1; i <= 10; i++) {//Счётчик попыток
            
                System.out.println(player1.getName() + ", введи число:");
                
                player1.setAttemptNum(i);
                player1.setNumber(console.nextInt());
                player1.setPlayerNumbers(player1.getNumber());//Передача в массив
                
                if (player1.getNumber() > secretNumber) {
                    System.out.println("Данное число больше того, что загадал компьютер");
                } else if (player1.getNumber() < secretNumber) {
                    System.out.println("Данное число меньше того, что загадал компьютер");
                } else {
                    System.out.println("Выиграл игрок " + player1.getName() + ", угадал число " + player1.getNumber() + " c " + player1.getAttemptNum() + " попытки.");
                    break outer;
                }
                if (player1.getAttemptNum() == 10) {//Проверка оставшегося количества попыток
                    System.out.println(player1.getName() + ", у Вас закончились попытки!");
                }
                
                System.out.println(player2.getName() + ", введи число:");

                player2.setAttemptNum(i);
                player2.setNumber(console.nextInt());
                player2.setPlayerNumbers(player2.getNumber());//Передача в массив
                
                if (player2.getNumber() > secretNumber) {
                    System.out.println("Данное число больше того, что загадал компьютер");
                } else if (player2.getNumber() < secretNumber) {
                    System.out.println("Данное число меньше того, что загадал компьютер");
                } else {
                    System.out.println("Выиграл игрок " + player2.getName() + ", угадал число " + player2.getNumber() + " c " + player2.getAttemptNum() + " попытки.");
                    break outer;
                }
                if (player2.getAttemptNum() == 10) {//Проверка оставшегося количества попыток
                    System.out.println(player2.getName() + ", у Вас закончились попытки!");
                }
                
                if (player1.getAttemptNum() == 10 && player2.getAttemptNum() == 10) {
                    System.out.println("Никто не угадал, Игра закончена!");
                    break outer;
                }
            }

        }
    }
}
