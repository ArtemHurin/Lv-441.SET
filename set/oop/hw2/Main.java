/*
 * Application for resolving Hw2 collections.
 */
package set.oop.set.oop.hw2;

import java.util.*;

/**
 * class Main for testing app
 *
 * @author Nataliia.
 * @version 1.2
 */

public class Main {
    /**
     * Overrided method hashcode.
     *
     * @return int value.
     */
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    /**
     * Overrided method equals.
     *
     * @return boolean value.
     */

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    /**
     * Overrided method toString.
     *
     * @return String value
     */

    @Override
    public String toString() {
        return super.toString();
    }

    /**
     * Point of starting my app.
     *
     * @param args may receive diff Objects.
     */
    public static void main(String[] args) {
        /**
         * Map interface called personMap with class HashMap, with values String,String.
         * personMap contains values LastName<String>, FirstName<String>.
         */
        Map<String, String> personMap = new HashMap<>();
        /**
         * method put for adding elements to the Map.
         */
        personMap.put("Aaa", "Orest");
        personMap.put("Bbb", "Olia");
        personMap.put("Ccc", "Ivan");
        personMap.put("Ddd", "Orest");
        personMap.put("Eee", "Ann");
        personMap.put("Fff", "Sophy");
        personMap.put("Ggg", "Kile");
        personMap.put("Hhh", "Swed");
        personMap.put("Iii", "Kwiat");
        personMap.put("Jjj", "Van");
        personMap.put("Kkk", "Andrew");
        /**
         *  method prints all Mao.
         */
        System.out.println("Map personMap: " + '\n' + personMap);

        /**
         * List person with class ArrayList that receives values from personMap, is created for checking same values
         * from the values of personMap.
         *
         */
        List<String> person = new ArrayList<>(personMap.values());
        /**
         * printing Arraalist.
         */
        System.out.println("ArrayList person: " + '\n' + person);

        String firstname = null;
        /**
         * two loops for passing through the list person.
         */
        for (int i = 0; i < person.size() - 1; i++) {
            for (int j = i + 1; j < person.size(); j++) {
                /**
                 * checking if elements from first loop have same in the second.
                 */
                if (person.get(i).equals(person.get(j)))
                /**
                 * saving same value in variable firstname.
                 */
                    firstname = person.get(i);
            }
        }
        /**
         * printing same value.
         */
        System.out.println("Same value is " + firstname);

        /**
         * interface Set entry from Object Map.Entry  for creating entrySet from personMap.
         */

        Set<Map.Entry<String, String>> entry = personMap.entrySet();
        /**
         * forEach loop
         * s - instance of  Map.Entry Object.
         */
        for (Map.Entry<String, String> s : entry) {
            String key = s.getKey();
            String value = s.getValue();
            /**
             * checking if value contains appropriate value.
             */
            if (value.contains("Van")) {
                System.out.println(s.getKey());
                /**
                 * removing element from Set entry if value is found.
                 */
                entry.remove(s);
            }
        }
        /**
         * printing personMap with removed values.
         */
        System.out.println("personMap with removed value: " + '\n' + personMap);
        /**
         * Creating new HashMap "inverted", to input unique personMap values,
         */
        Map<String, String> inverted = new HashMap<String, String>();
        /**
         * forEach loop from keySet of personMap.
         */
        for (String s : personMap.keySet()) {
            /**
             * inputting values to "inverted" from "personMap".
             */
            inverted.put(personMap.get(s), s);
        }
        /**
         * printing
         */
        System.out.println("Inverted personMap: " + inverted);
        /**
         * creating variable int 'dif' to save difference in size of these two maps,
         * so to check how many same elements there are in "personMap".
         */
        int dif = personMap.size() - inverted.size();
        /**
         * printing dif.
         */
        System.out.println("There were " + dif + "same values");
        System.out.println("-------------");
        /**
         * creating new HashMap that contains <String, List<String>(values from "personMap"
         * and List of keys from this Map).
         */
        HashMap<String, List<String>> newMap = new HashMap<String, List<String>>();
        /**
         * entrySet, p - instance of Map.Entry object.
         */
        for (Map.Entry<String, String> p : personMap.entrySet()) {
            /**
             * printing separately values and keys from personMap.
             */
            System.out.println(p.getValue() + " " + p.getKey());
            /**
             * checking if newMap key contains value from personMap. ????????????????????????????
             */
            if (newMap.containsKey(p.getValue())) {
                /**
                 * adding key to the ???????/
                 */
                newMap.get(p.getValue()).add(p.getKey());
            } else {

                List<String> tmp = new ArrayList<String>();
                tmp.add(p.getKey());
                newMap.put(p.getValue(), tmp);
            }
        }
        System.out.println("--------");
        for (Map.Entry<String, List<String>> ent : newMap.entrySet()) {
            System.out.println(ent.getKey() + " " + ent.getValue());
        }

    }
//            personMap.values().removeIf(value ->value.contains("Vans"));     remove all values?????
//                System.out.println(personMap);
}



