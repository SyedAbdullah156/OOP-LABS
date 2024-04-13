package Lab_7.Task_3;

public class Cat extends Animal
{
    public Cat(String name)
    {
        super(name);
    }

    @Override
    public void greets()
    {
        System.out.println("Meow");
    }
    
}
