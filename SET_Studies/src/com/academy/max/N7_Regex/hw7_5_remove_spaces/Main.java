//Enter a sentence that contains the words between more than one space. Convert all spaces,
// consecutive, one. For example, if we introduce the sentence
// "I    am      learning     Java   Core», we have to get the "I'm learning Java Core»

package com.academy.max.N7_Regex.hw7_5_remove_spaces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws IOException {

        System.out.println("Enter   some     words separated    by  many      spaces");

        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        String mySentenceWithSpaces = br.readLine();

        System.out.println("You entered: " + mySentenceWithSpaces);

        Pattern p = Pattern.compile("[\\S]+");
        Matcher m = p.matcher(mySentenceWithSpaces);

        while (m.find()) {
            System.out.print(mySentenceWithSpaces.substring(m.start(), m.end()) + " ");
        }
    }
}

