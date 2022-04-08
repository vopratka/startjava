import java.util.Random;
import java.util.Scanner;

public class GuessNumber{
    Scanner scan = new Scanner(System.in);
    
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }
   
    public void launch() {
        Random random = new Random();
        int rand = random.nextInt(100) + 1;
        
        System.out.println(player1.getName() + ", введи число:");        
        while (true) {
            player1.setNumber(scan.nextInt());
            if (player1.getNumber() > rand) {
              System.out.println("Данное число больше того, что загадал компьютер");
            } else if (player1.getNumber() < rand) {
              System.out.println("Данное число меньше того, что загадал компьютер");
            } else {
                System.out.println("Выиграл игрок " + player1.getName());
                break;
            }
            System.out.println(player2.getName() + ", введи число:");
            
            player2.setNumber(scan.nextInt());
            if (player2.getNumber() > rand) {
              System.out.println("Данное число больше того, что загадал компьютер");
            } else if (player2.getNumber() < rand) {
              System.out.println("Данное число меньше того, что загадал компьютер");
            } else {
                System.out.println("Выиграл игрок " + player2.getName());
                break;
            }
            System.out.println(player1.getName() + ", введи число:");
        }
    }
}
