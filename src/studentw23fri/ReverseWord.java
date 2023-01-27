package studentw23fri;

import java.util.Scanner;

/**
 *
 * @author d3m0n
 * Added comment for PULL
 */
public class ReverseWord {
    public static void main(String[] args) {
        System.out.println("Enter word: ");
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        
        char[] myLetters = new char[word.length()];
        
        for(int i = 0; i < myLetters.length; i++) {
            myLetters[i] = word.charAt(i);
            System.out.print(myLetters[i]);
        }
        System.out.println();
        System.out.println("Printing in reverse");
        
        for(int i = myLetters.length-1; i >= 0; i--) {
            System.out.print(myLetters[i]);
        }
    }
}
