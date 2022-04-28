package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int attemptNum; //Номер попытки
    // private int number; //Введённое число игроком
    private int[] numbers = new int[10]; //Массив вводимых игроками чисел

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
    
    //     public int getNumber() {
    //     return number;
    // }

    // public void setNumber(int number) {
    //     this.number = number;
    // }

    public void setNumbers(int number) {
        numbers[attemptNum] = number;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, attemptNum + 1);
    }
    
    public int getNumbesInt() {
        return numbers [attemptNum];
    }
    
}
