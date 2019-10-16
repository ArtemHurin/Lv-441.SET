package com.company.homework6.collection.homework;

import java.util.HashSet;
import java.util.Set;

public class SetUnionMain {
    public static void main(String[] args) {
        SetUnion set = new SetUnion();
        Set<Integer> set1 = new HashSet<>();
        set1.add(4);
        set1.add(6);
        set1.add(5);

        Set<Integer> set2 = new HashSet<>();
        set2.add(5);
        set2.add(7);
        set2.add(8);

        set.union(set1, set2);
        set.intersect(set1, set2);
    }
}
