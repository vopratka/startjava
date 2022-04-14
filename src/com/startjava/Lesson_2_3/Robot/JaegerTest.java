package com.startjava.Lesson_2_3.Robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger crimsonTyphoon = new Jaeger();
        crimsonTyphoon.setModelName("Crimson Typhoon");
        crimsonTyphoon.setMark("Mark-4");
        crimsonTyphoon.setOrigin("China");
        crimsonTyphoon.setHeight(76.2f);
        crimsonTyphoon.setWeight(1.722f);
        crimsonTyphoon.setSpeed(9);
        crimsonTyphoon.setStrenght(8);
        crimsonTyphoon.setArmor(6);

        System.out.println("Jaeger - " + crimsonTyphoon.getModelName());
        System.out.println("Модель - " + crimsonTyphoon.getMark());
        System.out.println("Страна происхождения - " + crimsonTyphoon.getOrigin());
        System.out.println("Высота - " + crimsonTyphoon.getHeight() + " м.");
        System.out.println("Масса - " + crimsonTyphoon.getWeight() + " т.");
        System.out.println("Скорость - " + crimsonTyphoon.getSpeed() + " единиц.");
        System.out.println("Сила - " + crimsonTyphoon.getStrenght() + " единиц.");
        System.out.println("Броня - " + crimsonTyphoon.getArmor() + " единиц.");
        
        System.out.println("-----------------------------");

        Jaeger strikerEureka = new Jaeger();
        strikerEureka.setModelName("Striker Eureka");
        strikerEureka.setMark("Mark-5");
        strikerEureka.setOrigin("Australia");
        strikerEureka.setHeight(76.2f);
        strikerEureka.setWeight(1.850f);
        strikerEureka.setSpeed(10);
        strikerEureka.setStrenght(10);
        strikerEureka.setArmor(9);

        System.out.println("Jaeger - " + strikerEureka.getModelName());
        System.out.println("Модель - " + strikerEureka.getMark());
        System.out.println("Страна происхождения - " + strikerEureka.getOrigin());
        System.out.println("Высота - " + strikerEureka.getHeight() + " м.");
        System.out.println("Масса - " + strikerEureka.getWeight() + " т.");
        System.out.println("Скорость - " + strikerEureka.getSpeed() + " единиц.");
        System.out.println("Сила - " + strikerEureka.getStrenght() + " единиц.");
        System.out.println("Броня - " + strikerEureka.getArmor() + " единиц.");        
    }
}