import java.util.Scanner;
public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите имя первого игрока: ");
        Player player1 = new Player(scan.next());
        
        System.out.println("Введите имя второго игрока: ");
        Player player2 = new Player(scan.next());
        
        System.out.println("\nИмя первого игрока: " + player1.getName());
        System.out.println("Имя второго игрока: " + player2.getName() + "\n");
        
        System.out.println("Игрок " + player1.getName() + ", введи число: ");
        player1.setNumber(scan.nextInt());
        System.out.println("\nИгрок " + player1.getName() + " выбрал: " + player1.getNumber());
        
        GuessNumber randomNum = new GuessNumber();
        System.out.println(randomNum.rand); 
    }
}