package com.company.homework6.collection.homework;

import java.util.Comparator;

public class CourseComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getCourse() - s2.getCourse();
    }
}
