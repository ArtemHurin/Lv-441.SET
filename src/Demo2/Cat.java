package Demo2;

public class Cat extends Animals{

    @Override
    public void Voice() {
        System.out.println("Cat voice: Meow meow");
    }

    @Override
    public void Feed() {
        System.out.println("Cat feed");
    }
}
