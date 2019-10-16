package Demo2;

public class Dog extends Animals {

    @Override
    public void Voice() {
        System.out.println("Dog voice: Gaf gaf");
    }

    @Override
    public void Feed() {
        System.out.println("Dog feed");
    }
}
