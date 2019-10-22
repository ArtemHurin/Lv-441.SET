//Enter a sentence that contains the words between more than one space. Convert all spaces,
// consecutive, one. For example, if we introduce the sentence
// "I    am      learning     Java   Core», we have to get the "I'm learning Java Core»

package com.academy.max.N7_Regex.hw7_3_Currency;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws IOException {

        System.out.println("Enter the text from the console that contains several occurrences of US currency (like $123.33).");

        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        String enteredText = br.readLine();

        System.out.println("You entered: " + enteredText);

        //	String enteredText = "The price for juicer is $123.33 and for vacuum is $150.00";
        //	Pattern p = Pattern.compile("(\\$[0-9]+)(\\.)([0-9]{2})");

        Pattern p = Pattern.compile("\\$(\\d)+\\.\\d{2}");
        Matcher m = p.matcher(enteredText);
        while (m.find()) {
            System.out.println(enteredText.substring(m.start(), m.end()) + " ");
        }
    }

}

