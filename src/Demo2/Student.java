package Demo2;

public class Student extends Person {

    Student(String name)
    {
        super(name);
    }

    public void print()
    {
        System.out.printf("I am %s \n",_name);
    }
}
