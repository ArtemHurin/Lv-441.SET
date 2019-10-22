// Write parameterized methods union(Set set1, Set set2) and intersect(Set set1, Set set2), realizing the
// operations of union and intersection of two sets. Test the operation of these techniques on two pre-filled sets.
//

package com.academy.max.N6_GenericCollections.hw6_3;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        Set set1 = new LinkedHashSet();
        Set set2 = new LinkedHashSet();
        Set unionOfSets = new LinkedHashSet();
        Set intersectionOfSets = new LinkedHashSet();

        set1.add("one");
        set1.add("two");
        set1.add("three");
        set1.add("four");

        set2.add("one");
        set2.add("three");
        set2.add("five");
        set2.add("eight");

        System.out.printf("Set1:" + set1.toString() + "\n");
        System.out.printf("Set2:" + set2.toString() + "\n");

        unionOfSets = union (set1,set2);
        intersectionOfSets = intersection(set1,set2);

        System.out.printf("Union of Set1 and Set2:" + unionOfSets.toString() + "\n");
        System.out.printf("Intersection of Set1 and Set2:" + intersectionOfSets.toString() + "\n");


    }

    private static Set union(Set set1, Set set2) {
        Set unionSet = new LinkedHashSet(set1);
        unionSet.addAll(set2);
        return unionSet;
    }

    private static Set intersection (Set set1, Set set2) {
        Set intersectionSet = new LinkedHashSet(set1);
        intersectionSet.retainAll(set2);
        return intersectionSet;
    }

}
