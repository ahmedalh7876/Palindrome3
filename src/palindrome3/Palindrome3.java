/*
 * Author: Ahmed A.
 * Completion date: 24/2/2020
 * This program tests to see if a phrase contains palindromes.
 */
package palindrome3;

import javax.swing.JOptionPane;

/**
 *
 * @author Ahmed
 */
public class Palindrome3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Try statement to make sure program doesn't crash when invalid input is inserted.
        try {
            //Take input from user and store it as a string.
            String input = JOptionPane.showInputDialog("Please enter your phrase to check if it's a palindrome (include a space after the final word):");
            //Removes spaces from input to make comparing the original string to the backwards string easy.
            String word = "";
            String backwards = "";
            int nOfPalindromes = 0, spaceIndex = 0, prevSpaceIndex = 1;
//            spaceIndex = input.indexOf(" ", spaceIndex + 1);

            while (spaceIndex >= 0) {

                spaceIndex = input.indexOf(" ", spaceIndex + 1);
                for (int i = prevSpaceIndex; i <= spaceIndex; i++) {
                    word += input.charAt(i - 1);
                }

                //Initiate backwards string as a null temporarily
                //For loop to run as many times as there are letters or characters in the word.
                for (int i = 1; i <= word.length(); i++) {
                    //Makes the backwards string equal to the input string backwards.
                    backwards += word.charAt(word.length() - i);
                }
                //Condition statement that tells user if the word is a palindrome or not.
                if (backwards.equalsIgnoreCase(word)) {
                    System.out.println("\"" + word + "\" is a palindrome");
                    nOfPalindromes++;
                    word = "";
                } else {
                    System.out.println("\"" + word + "\" is not a palindrome");
                    word = "";
                }

            }
            System.out.println("Your phrase was \"" + input + "\"");
            System.out.println("Number of palindromes in that phrase: " + nOfPalindromes);
        } catch (NullPointerException e) {
            //Exits system when cancel or X is pressed.
            System.exit(0);
        }

    }

}
