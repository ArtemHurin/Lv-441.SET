package com.company.homework6.collection.homework;

import java.util.Set;

public class SetUnion {

    public void union(Set set1, Set set2) {
        set1.addAll(set2);
        System.out.println(set1);
    }

    public void intersect(Set set1, Set set2) {
        set1.retainAll(set2);
        System.out.println(set1);
    }
}




