public class GuessNumber{
    public static void main(String[] args) {

        int desiredNum = 15;
        int playerNum = 20;

        for (int i = 1; i <= 100; i++) {
            if (playerNum > desiredNum) {
                System.out.println("Данное число больше того, что загадал компьютер");
                playerNum--;
            } else if (playerNum < desiredNum) {
                System.out.println("Данное число меньше того, что загадал компьютер");
                playerNum++;
            } else {
                System.out.println("Вы победили!");
                break;
            }
        }

    }
}
