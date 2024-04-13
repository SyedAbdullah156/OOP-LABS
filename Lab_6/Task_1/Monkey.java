package Lab_6.Task_1;

public class Monkey extends LivingThing
{
    public Monkey(String name)
    {
        super(name);
    }
    
    public void walk()
    {
        System.out.printf("The Monkey: %s is walking.%n", getName());
    }
}
