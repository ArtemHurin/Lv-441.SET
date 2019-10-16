package Demo2;

public class Cleaner extends Staff {

    final String TYPE_PERSON = "Cleaner";

    Cleaner(String name)
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
        System.out.println("Cleaner salary");
    }
}
