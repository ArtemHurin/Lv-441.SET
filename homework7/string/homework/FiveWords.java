package com.company.homework7.string.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FiveWords {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter sentence of five words");
        String sentence = br.readLine();
        String[] word = sentence.split(" ");
        String longest = word[0];
        for (int i = 1; i < word.length; i++) {
            if (word[i].length() >= longest.length()) {
                longest = word[i];
            }

        }
        System.out.println("The longest word is " + longest);

        System.out.println("It`s consist of " + longest.length() + " letters");

        StringBuilder sb = new StringBuilder(word[1]);
        sb.reverse();
        String reverse = sb.toString();

        System.out.println("Second reversed word - " + reverse);
    }
}
