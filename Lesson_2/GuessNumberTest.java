import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Введите имя первого игрока: ");
        Player player1 = new Player(scan.next());
        
        System.out.println("Введите имя второго игрока: ");
        Player player2 = new Player(scan.next());
        
        GuessNumber guess = new GuessNumber(player1, player1);
        
        String choice;
        do {
            guess.getStarted();
            do {
                System.out.println("Хотите продолжить игру? [yes/no]:");
                choice = scan.next();
            } while((!choice.equalsIgnoreCase("Yes")) && (!choice.equalsIgnoreCase("No")));
        } while (choice.equalsIgnoreCase("Yes"));        
    }
}