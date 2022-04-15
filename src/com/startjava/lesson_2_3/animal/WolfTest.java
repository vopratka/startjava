package com.startjava.lesson_2_3.animal;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.setGender("самец");
        wolf.setNickname("Зверь");
        wolf.setWeight(10.5f);
        wolf.setAge(10);
        wolf.setColor("серый");       

        System.out.println("Волк - " + wolf.getGender() + ", по кличке " + wolf.getNickname() + ", его вес " + wolf.getWeight() + " кг. Возраст - " + wolf.getAge() + " лет, окрас " + wolf.getColor() + ".");
    }
}