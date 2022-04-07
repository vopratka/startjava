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
   
    public void getStarted() {
        Random random = new Random();
        int rand = random.nextInt(101);
        if (rand != 0) {
            rand = rand;
        } else {
            rand = rand + 1;
        }      
        do {
            System.out.println("Число вводит " + player1.getName());
            player1.setNumber(scan.nextInt());
            if (player1.getNumber() > rand) {
              System.out.println("Данное число больше того, что загадал компьютер");
              System.out.println("Ход переходит к " + player2.getName());  
            } else if (player1.getNumber() < rand) {
              System.out.println("Данное число меньше того, что загадал компьютер");
              System.out.println("Ход переходит к " + player2.getName());
            } else {
                System.out.println("Выиграл игрок " + player1.getName());
                break;
            }
            
            System.out.println("Число вводит " + player2.getName());
            player1.setNumber(scan.nextInt());
            if (player2.getNumber() > rand) {
              System.out.println("Данное число больше того, что загадал компьютер");
              System.out.println("Ход переходит к " + player1.getName());  
            } else if (player2.getNumber() < rand) {
              System.out.println("Данное число меньше того, что загадал компьютер");
              System.out.println("Ход переходит к " + player1.getName());
            } else {
                System.out.println("Выиграл игрок " + player2.getName());
                break;
            }
        } while (player1.getNumber() != rand || player2.getNumber() != rand);
    }
}