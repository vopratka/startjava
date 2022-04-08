import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Введите имя первого игрока: ");
        Player player1 = new Player(scan.next());
        
        System.out.println("Введите имя второго игрока: ");
        Player player2 = new Player(scan.next());
        
        GuessNumber game = new GuessNumber(player1, player2);
        
        String choice;
        do {
            game.launch();
            do {
                System.out.println("Хотите продолжить игру? [yes/no]:");
                choice = scan.next();
            } while((!choice.equalsIgnoreCase("Yes")) && (!choice.equalsIgnoreCase("No")));
        } while (choice.equalsIgnoreCase("Yes"));        
    }
}
