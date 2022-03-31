public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf1 = new Wolf("самец", "Зверь", "чёрный", 4, 10.4f);
        Wolf wolf2 = new Wolf("самка", "Маша", "серый", 2, 8.5f);
        
        System.out.println("Первый волк - " + wolf1.gender + " по кличке " + wolf1.nickname + ".");
        System.out.println("Ему " + wolf1.age + " года. Он " + wolf1.color + ", весит " + wolf1.weight + " кг.\n");

        System.out.println("Второй волк - " + wolf2.gender + " по кличке " + wolf2.nickname + ".");
        System.out.println("Ей " + wolf2.age + " года. Она имеет " + wolf2.color + " окрас, весит " + wolf2.weight + " кг.\n");
    }
}

class Wolf {
    String gender;
    String nickname;
    float weight;
    int age;
    String color;

    public Wolf(String gender, String nickname, String color, int age, float weight) {
        this.gender = gender;
        this.nickname = nickname;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

    public Wolf() {
    }
}