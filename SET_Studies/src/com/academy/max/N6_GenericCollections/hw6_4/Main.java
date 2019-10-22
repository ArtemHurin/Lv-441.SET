//
//        Create map personMap and add to it ten persons of type <String, String> (lastName, firstName).
//        Output the entities of the map on the screen.
//        There are at less two persons with the same firstName among these 10 people?
//        Remove from the map person whose firstName is ”Orest” (or other). Print result.

package com.academy.max.N6_GenericCollections.hw6_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        Map<String, String> personMap = new LinkedHashMap<>();

        personMap.put("Buzhakov", "Vasyl");
        personMap.put("Mykulovyvh", "Ivanka");
        personMap.put("Yeremenko", "Lukian");
        personMap.put("Olenyn", "Ivan");
        personMap.put("Hrushchak", "Grisha");
        personMap.put("Kovryhyna", "Nastia");
        personMap.put("Parubok", "Grisha");
        personMap.put("Katrych", "Oleh");


        /* Printing original map */

        System.out.println("********  Original map: *********");
        printMap(personMap);

        String message;
        String keyToDelete = null;
        boolean shouldDelete = false;


        /* Using method to determine if same names are in the map */

        message = (sameNamesPresent(personMap)) ? "\nThere are same names in Person map\n" : "\nAll names are unique in Person map\n";
        System.out.println(message);


        /* Erasing a person from map by User's choice */

        System.out.println("Enter name of the person to delete");

        BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
        String nameToDelete = br1.readLine();

        for (Map.Entry<String, String> entry : personMap.entrySet()) {
            if (entry.getValue().toLowerCase().equals(nameToDelete.toLowerCase())) {
                keyToDelete = entry.getKey();
                shouldDelete = true;
            }
        }

        if (shouldDelete) {
            System.out.println("Removing person: " + nameToDelete);
            System.out.println();
            personMap.remove(keyToDelete);
        }


        /* Printing Changed map */
        System.out.println("********  Changed map: *********");
        printMap(personMap);

    }
    private static void printMap(Map<String, String> someMap) {
        for (Map.Entry<String, String> entry : someMap.entrySet()) {
            System.out.println(entry.getKey() + " \t" + entry.getValue());
        }
    }

    private static boolean sameNamesPresent(Map someMap) {
        Collection collectionOfValues = someMap.values();
        Set setOfValues = new HashSet();
        setOfValues.addAll(collectionOfValues);
        if (collectionOfValues.size() == setOfValues.size()) {
            return false;
        } else {
            return true;
        }
    }
}
