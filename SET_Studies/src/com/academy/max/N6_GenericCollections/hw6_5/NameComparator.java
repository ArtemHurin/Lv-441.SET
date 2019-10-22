package com.academy.max.N6_GenericCollections.hw6_5;
import java.util.Comparator;

    public class NameComparator implements Comparator<Student>{

        public int compare(Student o1, Student o2) {
            return o1.getLastName().compareTo(o2.getLastName());
        }
    }

