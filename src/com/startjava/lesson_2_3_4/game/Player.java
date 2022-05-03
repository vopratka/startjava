package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int attemptNum;
    private int[] numbers = new int[10];

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
        numbers[attemptNum] = number;
    }

    public int[] getNumbers() {
        return Arrays.copyOf(numbers, attemptNum + 1);
    }

    public int getLastNum() {
        return numbers [attemptNum];
    }

    public void resetArray() {
        Arrays.fill(numbers, 0, attemptNum, 0);
    }
}