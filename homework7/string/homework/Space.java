package com.company.homework7.string.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Space {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a sentence that contains the words between more than one space");
        String sentence = br.readLine();
        String pattern = "\\s{2,}";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(sentence);
        sentence = m.replaceAll(" ");
        System.out.println(sentence);
    }
}
