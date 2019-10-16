package Demo2;

public class Animals implements Animal {

    @Override
    public void Voice() {
        System.out.println("Animal voice");
    }

    @Override
    public void Feed() {
        System.out.println("Animal feed");
    }
}
