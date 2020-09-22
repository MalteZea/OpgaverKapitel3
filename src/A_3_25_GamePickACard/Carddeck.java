package A_3_25_GamePickACard;

import java.util.Random;

//Her bliver et kort nr og en kulør udvalgt random

public class Carddeck {

    //Vælger et random nummer imellem 1..13 som syboliserer et kort

    public static int Choice() {
        int[] cards = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

        int rdnCard = new Random().nextInt(cards.length);

        return cards[rdnCard];

    }

    //Vælger et random nummer imellem 1..4 som skal bruges til en random kulør efterfølgende

    public static int Suits() {
        int[] suit = {1, 2, 3, 4};

        int rdnSuit = new Random().nextInt(suit.length);

        return suit[rdnSuit];
    }

    //Vælger en kulør alt efter hvilket random nummer blev trukket i int Suits()

    public static String SuitChoice() {

        String suitSpecific;

        switch (Suits()) {
            case 1:
                suitSpecific = "Clubs";
                break;
            case 2:
                suitSpecific = "Diamonds";
                break;
            case 3:
                suitSpecific = "Hearts";
                break;
            case 4:
                suitSpecific = "Spades";
                break;

                //Jeg forstår ikke hvorfor koden ikke fungere uden suitSpecific har en default "værdi".
                //Er det fordi at switch'en afhænger af en seperat metode, så hvis den metode ikke kaldes, så
                //skal denne metode have en backup værdi?
            default: suitSpecific = "";
        }

        return suitSpecific;
    }
}

