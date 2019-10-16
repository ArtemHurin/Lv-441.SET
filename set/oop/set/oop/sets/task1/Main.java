package set.oop.set.oop.set.oop.sets.task1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        System.out.println(set1.isEmpty());
        set1.add(1);
        set1.add(3);
        set1.add(6);
        set1.add(2);

        Set<Integer> set2 = new HashSet<>();
        set2.add(5);
        set2.add(1);
        set2.add(9);
        set2.add(10);
        set2.add(3);
/**
 *
 * collection copy of Set1
 */
        Set<Integer> intersection = new HashSet<>(set1);
        System.out.println(intersection);
        /**
         *show same elements of the collection set1 and set2
         */
        intersection.retainAll(set2);
        /**
         * print collection intersectoin only with same elements in both collections(Set1, Set2)
         */
        System.out.println(intersection);
/**
 * Collection copy of se1
 */
        Set<Integer> dif = new HashSet<>(set1);
        /**
         * method leaves only unique elements from collection set1
         */
        dif.removeAll(set2);
        /**
         * print collection only with unique values from set1
         */
        System.out.println(dif);

        /**
         * method union same values from both collections(set1,set2)  and unique values from collection set1.
         */
        dif.addAll(intersection);
        /**
         * print union collection
         */
        System.out.println(dif);
/**
 * Collection copy of set2
 */
        Set<Integer> dif2 = new HashSet<>(set2);
        /**
         * method leaves all the unique values from collection set2
         */
        dif2.removeAll(set1);
        /**
         * method print collection dif2 with unique values from collection set2
         */
        System.out.println(dif2);
        /**
         * union dif and dif2
         */
        dif.addAll(dif2);
        /**
         * method print collections with same values in both collections(set1,set2) and unique values of both collections.
         */
        System.out.println(dif);
    }
}