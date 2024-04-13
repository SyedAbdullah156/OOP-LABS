package Lab_6.Task_1;

public class Human extends LivingThing
{
    public Human(String name)
    {
        super(name);
    }
    
    public void walk()
    {
        System.out.printf("The Human: %s is walking.%n", super.getName());
    }
}
