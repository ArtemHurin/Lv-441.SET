package Demo2;

public class Inheritance {

    public void practicalTaskOne()
    {
        //define
        Animals[] array = new Animals[4];

        //Data input
        array[0] = new Cat();
        array[1] = new Dog();
        array[2] = new Cat();
        array[3] = new Dog();

        //Data output
        for(int i=0;i<array.length;i++)
        {
            array[i].Feed();
            array[i].Voice();
        }
    }

    public void practicalTaskTwo()
    {
        //define
        Person[] array = new Person[3];

        //Data input
        array[0] = new Teacher("Teacher_name");
        array[1] = new Cleaner("Cleaner_name");
        array[2] = new Student("Student_name");

        //Data output
        for(int i=0;i<array.length;i++)
        {
            if (array[i] instanceof Staff) {
                array[i].print();
                ((Staff)array[i]).Salary();
            }
            else {
                array[i].print();
            }

        }
    }
}
