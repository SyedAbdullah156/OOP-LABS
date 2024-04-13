class Animal 
{
    protected String name;

    public Animal(String name) 
    {
        this.name = name;
    }

    public void speak() 
    {
        System.out.println("An animal makes a sound");
    }
}

class Dog extends Animal 
{
    private String breed;

    public Dog(String name, String breed) 
    {
        super(name);
        this.breed = breed;
    }

    public void speak() 
    {
        System.out.println("A dog barks");
    }
}

public class Main 
{
    public static void main(String[] args) 
    {
        Dog myDog = new Dog("Buddy", "Golden Retriever");
        myDog.speak();
    }
}
