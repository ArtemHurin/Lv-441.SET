package set.oop.set.oop.practikalTask2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 *Praktical task 2 Maps
 *
 * @author Nataliia
 *
 * @version 1.1000000
 */
public class Main {
    /**
     * Overrided Hashcode to compare to elements
     *
     * @return int
     */
    @Override
    public int hashCode() {
        return super.hashCode();
    }


    /**
     * Override equals to compare two elements
     * @param obj incoming values
     * @return boolean true
     */

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    /**
     * Override method toString to make outcoming test more readable
     * @return String value
     */
    @Override
    public String toString() {
        return super.toString();
    }

    /**
     * Main to test my work
     * @param args non defined
     * @throws IOException for Buffered reader (Input Output)
     */
    public static void main(String[] args) throws IOException {
        /**
         * Map interface employeeMap class HashMap key Integer, value String
         */
        Map<Integer, String> employeeMap = new HashMap<>();
        /**
         * adding elements of the map.
         */
        employeeMap.put(1, "John");
        employeeMap.put(2, "Frank");
        employeeMap.put(3, "Kila");
        employeeMap.put(4, "Sandra");
        employeeMap.put(5, "Akka");
        employeeMap.put(6, "Lina");
        employeeMap.put(7, "Qua");
        /**
         * printing map
         */
        System.out.println(employeeMap);
        /**
         * OObject of Buffered reader
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter ID");
        /**
         * int id for identifying key value entered from console
         */
        int id = Integer.parseInt(br.readLine());
        /**
         * checking if entered value is  key in the list
         */
        if (employeeMap.containsKey(id)) {

            System.out.println(employeeMap.get(id));

        } else {

            System.out.println("Id is not found");

        }
        System.out.println("Enter name, please");
        /**
         * String name for checking excising value in map
         */
        String name = br.readLine();
        for(Map.Entry<Integer, String> me:employeeMap.entrySet()){
            int id1 = me.getKey();
            String name1 = me.getValue();
            /**
             * checking if entered value is equals to any from the map.
             */

            if(name1.equals(name)){
                /**
                 * printing the key of appropriate value
                 */
                System.out.println(id1 + " " + name);
            }

        }

    }
    }

