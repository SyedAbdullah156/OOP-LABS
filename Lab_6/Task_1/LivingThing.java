package Lab_6.Task_1;

public abstract class LivingThing 
{
    private String name;

    public LivingThing(String name)
    {
        this.name = name;
    }

    public void breath()
    {
        System.out.println("The Living Thing is Breathing Oxygen.");
    }

    public void eat()
    {
        System.out.println("The Living Thing is eating.");
    }

    public abstract void walk();

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
