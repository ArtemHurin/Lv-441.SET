//Enter in the console sentence of five words.
//		display the longest word in the sentence
//		determine the number of its letters
//		bring the second word in reverse order
//

package com.academy.max.N7_Regex.hw7_4_five_words;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException, com.academy.max.N7_Regex.hw7_1_five_words.ExceptionWrongAmountOfWords {

        String mysentence = "";
        String longestWord;

        System.out.println("Enter five words separated by space");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String enteredSentence = br.readLine();

        mysentence = enteredSentence;
        System.out.println("You entered: " + mysentence);

        String[] words = mysentence.split(" ");
        if (words.length != 5) {
            throw new com.academy.max.N7_Regex.hw7_1_five_words.ExceptionWrongAmountOfWords();
        }


        longestWord = DetermineLongestWord(words);
        System.out.println("The longest word is: " + longestWord);
        System.out.println("The longest word's length is: " + longestWord.length() + " characters");

        WordInReverseOrder(words[1]);
    }

    /* This method determines longest word from array of words */
    private static String DetermineLongestWord(String[] words) {
        int indexOfLongestWord = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > words[indexOfLongestWord].length()) {
                indexOfLongestWord = i;
            }
        }
        String longestW = words[indexOfLongestWord];
        return longestW;
    }

    // This method reverses given word and prints it
    private static String WordInReverseOrder(String normalString) {
        String reversedString = "";

        for (int i = normalString.length(); i > 0; i--) {
            reversedString = reversedString.concat(normalString.substring(i - 1, i));
        }
        System.out.println("Second word is: " + normalString + "\nSecond reversed word is: " + reversedString);
        return reversedString;
    }
}

