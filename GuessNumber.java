public class GuessNumber{
    public static void main(String[] args) {
<<<<<<< HEAD
        int hiddenNumber = 15;
        int playerNum = 20;

        for (int i = 1; i <= 100; i++) {
            if (playerNum > hiddenNumber) {
                System.out.println("Данное число больше того, что загадал компьютер");
                playerNum--;
            } else if (playerNum < hiddenNumber) {
=======

        int desiredNum = 15;
        int playerNum = 20;

        for (int i = 1; i <= 100; i++) {
            if (playerNum > desiredNum) {
                System.out.println("Данное число больше того, что загадал компьютер");
                playerNum--;
            } else if (playerNum < desiredNum) {
>>>>>>> feaf32f80bd66886fc4c042fa59ab0e73a213ac6
                System.out.println("Данное число меньше того, что загадал компьютер");
                playerNum++;
            } else {
                System.out.println("Вы победили!");
                break;
            }
        }

    }
<<<<<<< HEAD
}
=======
}
>>>>>>> feaf32f80bd66886fc4c042fa59ab0e73a213ac6
