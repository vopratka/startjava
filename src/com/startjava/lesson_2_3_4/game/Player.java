package com.startjava.lesson_2_3_4.game;

public class Player {
    private String name;
    private int attemptNum; //Номер попытки
    private int[] number = new int[10]; //Массив вводимых игроками чисел

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

    public void setNumber(int number) {
        this.number = number[attemptNum];
    }

    public int getNumber() {
        return number[attemptNum];
    }
}