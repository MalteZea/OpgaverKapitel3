package A_3_14_GameHeadsOrTails;
import java.util.Scanner;

/* (Game: heads or tails) Write a program that lets the user guess whether the flip of
a coin results in heads or tails. The program randomly generates an integer 0 or 1,
which represents head or tail. The program prompts the user to enter a guess, and
reports whether the guess is correct or incorrect. */


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Heads and tails game. Take a guess. Input 1 for heads or 2 for tails: ");

        for (int i = 0; i <= 100; i++) {
            int guess = input.nextInt();

            if (guess < 1 || guess > 2) {
                System.out.println("You gave a wrong input!");
                System.exit(0);
            }

            if (CoinFlip() == guess) System.out.println("You win! Try again!");
            else System.out.println("Damn, you loose, try again!");
        }
    }

        public static int CoinFlip() {
            int coinFlip = (int) (Math.random() * 2 + 1);
            String coinSide;
            if (coinFlip == 1) coinSide = "Heads";
            else coinSide = "Tails";
            System.out.println("The coin flips.... " + coinSide);
            return coinFlip;
        }
}
