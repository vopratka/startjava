public class WolfTest {
	
	String nickname;
    float weight;
    int age;
    String color;
	
    public static void main(String[] args) {
        WolfTest wolf = new WolfTest();
		wolf.nickname = "Зверь";
		wolf.weight = 10.5f;
		wolf.age = 5;
		wolf.color = "серый";		
        
        System.out.println("Волк по кличке " + wolf.nickname + ", его вес " + wolf.weight + " кг. Возраст - " + wolf.age + " лет, окрас " + wolf.color + ".");
    }
}