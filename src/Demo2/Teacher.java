package Demo2;

public class Teacher extends Staff {

    final String TYPE_PERSON = "Teacher";

    Teacher(String name)
    {
        super(name);
        System.out.printf("My profession is %s \n",TYPE_PERSON);
    }

    @Override
    public void print() {
        System.out.printf("I am %s \n",_name);
    }

    public void Salary()
    {
        System.out.println("Teacher salary");
    }

}
