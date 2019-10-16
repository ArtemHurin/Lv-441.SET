package com.company.homework7.string.task;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Name {
    public static void main(String[] args) throws IOException {
        String fullName;


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your surname, name and patronymic");
        fullName = br.readLine();

        String[] name = fullName.split(" ");

        if(name[2].contains("ivna")) {
            name[2] = name[2].replace("ivna", "");
        } else if(name[2].contains("ovych")) {
            name[2] = name[2].replace("ovych", "");
        }

        System.out.println("Surname and initials:");
        System.out.println(name[0] + " " + name[1].charAt(0) + " " + name[2].charAt(0));

        System.out.println("Name - " + name[1]);

        System.out.println("Name, middle name and surname");
        System.out.println(name[1] + " " + name[2] + " " + name[0]);
    }
}
