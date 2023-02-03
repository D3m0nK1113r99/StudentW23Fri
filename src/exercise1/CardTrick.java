package exercise1;

import java.util.Random;
import java.util.Scanner;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022 
 */
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        
        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            card.setValue((int) ((Math.random() * (13 - 1)) + 1));
            // 
            card.setSuit(Card.SUITS[random.nextInt(4)]);
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
        }
        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        // If the guess is successful, invoke the printInfo() method below.
        
        Card card2 = new Card();
        while (true) {
            System.out.println("Enter the card value: ");           
            int value = scan.nextInt();
            System.out.println("Enter the card suit: ");
            String suit = scan.next();
            if (value == card2.getValue() && suit.equals(card2.getSuit())) {
                printInfo();
                break;
            } else if (value == card2.getValue() && suit.equals(card2.getSuit())) {
                System.out.println("The value is correct, but the suit is incorrect.");
            } else if (value != card2.getValue() && suit.equals(card2.getSuit())) {
                System.out.println("The value is incorrect, but the suit is "
                        + ""
                        + "correct.");
            } else {
                System.out.println("Both the value and the suit are incorrect.");
            }
        }
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * replace this information with your own.
     * @author Paul Bonenfant Jan 2022
     */
    private static void printInfo() {
        //I'm done!
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Pham Tran Tuan Khanh, but you can call me TK");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Study harder in Sheridan College");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Playing video games");
        System.out.println("-- Biking");
        System.out.println("-- Watching YouTube");

        System.out.println();
        
    
    }

}
