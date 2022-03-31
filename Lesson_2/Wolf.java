public class Wolf {
    String gender;
    String nickname;
    float weight;
    int age;
    String color;
    
    void go() {
        System.out.println("Идёт");
    }
    
    void sit() {
        System.out.println("Сидит");
    }
    
    void run() {
        System.out.println("Бежит");
    }

    void yowl() {
        System.out.println("Воет");
    }   

    void hunt() {
        System.out.println("Охотится");
    }
    
    public static void main(String[] args) {
        Wolf wolf1 = new Wolf();
        Wolf wolf2 = new Wolf();
        
        wolf1.run();
        wolf1.yowl();
        wolf1.hunt();
        
        System.out.println();
        
        wolf2.go();
        wolf2.sit();
    }
}