/*
 * This application is created  for handling list of Students and theirs courses.
 */
package set.oop.set.oop.hw2.student;

import java.util.Comparator;

/**
 * class SortByCourse that implements Comparator <Student> .
 * Class is created for comparing values Student's course.
 *
 * @version 1.1
 * author Nataliia
 */
public class SortbyCourse implements Comparator<Student> {
    /**
     * Overrided method for comparing values Student's course.
     * @param o1 instance of Student.
     * @param o2 instance of Student
     * @return result of comparing to Objects.
     */
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getCourse().compareTo(o2.getCourse());
    }
}
