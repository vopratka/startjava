package com.startjava.lesson_2_3_4.game;

public class Player {
    private String name;
    private int attemptNum; //Номер попытки
    private int number; //Введённое число игроком
    private int[] playerNumbers = new int[10]; //Массив вводимых игроками чисел

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAttemptNum() {
        return attemptNum;
    }

    public void setAttemptNum(int attemptNum) {
        this.attemptNum = attemptNum;
    }
    
        public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setPlayerNumbers(int x) {//Это решение нагуглил. Почему так работает пока не разобрался. Прошу объяснить, или подсказать где найти описание работы этого способа.
        playerNumbers[attemptNum] = x;
    }

    public int[] getPlayerNumbers() {
        return playerNumbers;
    }
}