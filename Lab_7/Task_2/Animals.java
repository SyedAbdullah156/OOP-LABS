package Lab_7.Task_2;

public interface Animals 
{
    default void speak() 
    {
        System.out.println("This animal speaks");
    }

    default void move() 
    {
        System.out.println("This animal moves forward");
    }
}
