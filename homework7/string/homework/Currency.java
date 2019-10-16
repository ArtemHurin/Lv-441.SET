package com.company.homework7.string.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Currency {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter text with several occurrences of US currency.");
        String text = br.readLine();
        Pattern p = Pattern.compile("\\$\\d+\\.\\d{2}");
        Matcher m = p.matcher(text);

        while (m.find()) {
            System.out.println(text.substring(m.start(), m.end()));
        }

    }
}
