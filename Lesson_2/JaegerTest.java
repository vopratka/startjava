public class JaegerTest {
    public static void main(String[] args) {
        Jaeger CrimsonTyphoon = new Jaeger();
        CrimsonTyphoon.setModelName("Crimson Typhoon");
        CrimsonTyphoon.setMark("Mark-4");
        CrimsonTyphoon.setOrigin("China");
        CrimsonTyphoon.setHeight(76.2f);
        CrimsonTyphoon.setWeight(1.722f);
        CrimsonTyphoon.setSpeed(9);
        CrimsonTyphoon.setStrenght(8);
        CrimsonTyphoon.setArmor(6);

        System.out.println("Jaeger - " + CrimsonTyphoon.getModelName());
        System.out.println("Модель - " + CrimsonTyphoon.getMark());
        System.out.println("Страна происхождения - " + CrimsonTyphoon.getOrigin());
        System.out.println("Высота - " + CrimsonTyphoon.getHeight() + " м.");
        System.out.println("Масса - " + CrimsonTyphoon.getWeight() + " т.");
        System.out.println("Скорость - " + CrimsonTyphoon.getSpeed() + " единиц.");
        System.out.println("Сила - " + CrimsonTyphoon.getStrenght() + " единиц.");
        System.out.println("Броня - " + CrimsonTyphoon.getArmor() + " единиц.");
        
        System.out.println("-----------------------------");

        Jaeger StrikerEureka = new Jaeger();
        StrikerEureka.setModelName("Striker Eureka");
        StrikerEureka.setMark("Mark-5");
        StrikerEureka.setOrigin("Australia");
        StrikerEureka.setHeight(76.2f);
        StrikerEureka.setWeight(1.850f);
        StrikerEureka.setSpeed(10);
        StrikerEureka.setStrenght(10);
        StrikerEureka.setArmor(9);

        System.out.println("Jaeger - " + StrikerEureka.getModelName());
        System.out.println("Модель - " + StrikerEureka.getMark());
        System.out.println("Страна происхождения - " + StrikerEureka.getOrigin());
        System.out.println("Высота - " + StrikerEureka.getHeight() + " м.");
        System.out.println("Масса - " + StrikerEureka.getWeight() + " т.");
        System.out.println("Скорость - " + StrikerEureka.getSpeed() + " единиц.");
        System.out.println("Сила - " + StrikerEureka.getStrenght() + " единиц.");
        System.out.println("Броня - " + StrikerEureka.getArmor() + " единиц.");        
    }
}