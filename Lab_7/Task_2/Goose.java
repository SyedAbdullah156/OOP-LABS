package Lab_7.Task_2;

public class Goose implements Animals, Flying
{
    @Override
    public void speak()
    {
        System.out.println("This goose speaks");
    }

    @Override
    public void move() 
    {
        System.out.println("This goose moves forward");
    }

    @Override
    public void fly()
    {
        System.out.println("Goose is flying");
    }
}
