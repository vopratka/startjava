package com.startjava.Lesson_2_3.person;

public class Person {
    
    String gender = "Женщина";
    String name = "Ольга";
    float height = 1.68f;
    float weight = 64.3f;
    int age = 30;
    
    void go() {
        System.out.println("Идёт");
    }

    void sit() {
        System.out.println("Сидит");
    }
    
    boolean run() {
        return true;
    }
    
    String talk() {
        return "Говорит";
    }
    
    boolean learnJava() {
        return true;
    }
}