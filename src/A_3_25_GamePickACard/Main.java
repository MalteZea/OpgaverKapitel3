package A_3_25_GamePickACard;

import java.util.Random;
import java.util.Scanner;

/* (Game: pick a card) Write a program that simulates picking a card from a deck
of 52 cards. Your program should display the rank (Ace, 2, 3, 4, 5, 6, 7, 8, 9, 10,
Jack, Queen, King) and suit (Clubs, Diamonds, Hearts, Spades) of the card. */

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*  Bruger input er kun symbolsk, og bruges til at få brugeren til at
            føle, at vedkommende har en påvirkning på progammet.
            Brugerens input bruges slet ikke efterfølgende. */

        System.out.print("Pick a card between 1 and 52: ");
        int card = input.nextInt();

        switch (Carddeck.Choice()) {
            case 1:
                System.out.print("You picked Ace of ");
                break;
            case 11:
                System.out.print("You picked Jack of ");
                break;
            case 12:
                System.out.print("You picked Queen of ");
                break;
            case 13:
                System.out.print("You picked King of ");
                break;
            default:
                System.out.print("You picked " + Carddeck.Choice() + " of ");
        }
        System.out.println(Carddeck.SuitChoice());

    }
}

