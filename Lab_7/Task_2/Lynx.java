package Lab_7.Task_2;

public class Lynx implements Animals
{
    @Override
    public void speak()
    {
        System.out.println("This Lynx speaks");
    }

    @Override
    public void move() 
    {
        System.out.println("This Lynx moves forward");
    }
}
