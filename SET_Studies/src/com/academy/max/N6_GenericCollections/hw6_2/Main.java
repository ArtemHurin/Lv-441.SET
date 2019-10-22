//        In the main() method declare map employeeMap of pairs <Integer, String>.
//        Add to employeeMap seven pairs (ID, name) of some persons. Display the map on the screen.
//        Ask user to enter ID, then find and write corresponding name from your map. If you can't find this ID -
//        say about it to user (use function containsKey()).
//        Ask user to enter name, verify than you have name in your map and write corresponding ID.
//        If you can't find this name - say about it to user (use function containsValue()).

package com.academy.max.N6_GenericCollections.hw6_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static com.academy.max.Helpers.inputIntNumber;

public class Main {

    public static void main(String[] args) throws IOException {

        Map<Integer, String> employeeMap = new TreeMap<Integer, String>();

        employeeMap.put(1, "Vasyl");
        employeeMap.put(2, "Ivanka");
        employeeMap.put(3, "Lukian");
        employeeMap.put(4, "Ivan");
        employeeMap.put(5, "Grisha");
        employeeMap.put(6, "Nastia");
        employeeMap.put(7, "Oleh");

        System.out.println(employeeMap.toString());


        /* Finding name by Key */

        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));

        boolean wasCorrectKey = false;
        String name = null;
        String enteredText;

        System.out.println("Please type a key (from 1 to 7)");

        while (!wasCorrectKey) {
            enteredText = br1.readLine();
            int enteredNumber = Integer.parseInt(enteredText);
            name = employeeMap.get(enteredNumber);
            wasCorrectKey = employeeMap.containsKey(enteredNumber);

            if (wasCorrectKey) {
                System.out.println("The name which corresponds to entered key is: \n" + name);
            } else {
                System.out.printf("There is no name with key: %s in the map. Try entering key again.\n", enteredText);
            }

        }

        /* Finding Key by Name */

        boolean wasCorrectName = false;
        Integer nameKey = 0;

        System.out.println("Please type a name from the map to get its key)");

        while (!wasCorrectName) {
            enteredText = br1.readLine();
            nameKey = getKey (employeeMap, enteredText);

            if (nameKey!=null) {
                wasCorrectName = true;
                System.out.println("The key which corresponds to entered name is: " + nameKey);
            } else {
                System.out.printf("There is no name: %s in the map. Try entering name again.\n", enteredText);
            }
        }
    }

    /* Method accepts Map and value to search and returns Integer index of 1st found value or null */

    private static <Integer, String> Integer getKey(Map<Integer, String> map, String value) {
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getValue().equals(value)) {
                return entry.getKey();
            }
        }
        return null;
    }

}

