package Lab_7.Task_3;

public class TestClass 
{
    public static void main(String[] args) 
    {
        // Polymorphic behavior
        Animal animal1 = new Dog("Buddy");
        Animal animal2 = new Cat("Whiskers");
        Animal animal3 = new BigDog("Max");

        animal1.greets(); // Calls Dog's implementation of greets()
        animal2.greets(); // Calls Cat's implementation of greets()
        animal3.greets(); // Calls BigDog's implementation of greets()

        System.out.println();

        // Non-polymorphic behavior
        Dog dog = new Dog("Rocky");
        Cat cat = new Cat("Mittens");
        BigDog bigDog = new BigDog("Charlie");

        dog.greets(); // Calls Dog's implementation of greets()
        cat.greets(); // Calls Cat's implementation of greets()
        bigDog.greets(); // Calls BigDog's implementation of greets()

        System.out.println();

        // Method overloading
        Dog dog1 = new Dog("Buddy");
        Dog dog2 = new Dog("Max");

        dog1.greets(dog2); // Calls greets(Dog) method in Dog class
        dog2.greets(dog1); // Calls greets(Dog) method in Dog class
    }
}