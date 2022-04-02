public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
		wolf.nickname = "Зверь";
		wolf.weight = 10.5f;
		wolf.age = 5;
		wolf.color = "серый";		
        
        System.out.println("Волк по кличке " + wolf.nickname + ", его вес " + wolf.weight + " кг. Возраст - " + wolf.age + " лет, окрас " + wolf.color + ".");
    }
}