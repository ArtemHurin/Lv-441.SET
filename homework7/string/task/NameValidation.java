package com.company.homework7.string.task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameValidation {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] name = new String[5];
        for (int i = 0; i < name.length; i++) {
            System.out.println("Enter " + (i + 1) + " name");
            name[i] = br.readLine();
        }

        String pattern = "\\w{3,15}";
        Pattern p = Pattern.compile(pattern);
            Matcher[] m = new Matcher[name.length];
        for (int i = 0; i < name.length; i++) {
            m[i] = p.matcher(name[i]);
            if (m[i].matches()) {
                System.out.println("Name " + name[i] + " is valid");
            } else {
                System.out.println("Name " + name[i] + " is NOT valid");
            }

        }
    }
}
