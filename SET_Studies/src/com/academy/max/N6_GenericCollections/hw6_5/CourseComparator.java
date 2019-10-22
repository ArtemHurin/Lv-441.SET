package com.academy.max.N6_GenericCollections.hw6_5;
import java.util.Comparator;

public class CourseComparator implements Comparator<Student>{

    public int compare(Student st1, Student st2) {
        return st1.getCourse() - st2.getCourse();
    }
}

