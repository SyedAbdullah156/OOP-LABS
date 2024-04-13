package Lab_7.Task_2;

public class Test 
{
    public static void main(String[] args)
    {
        Animals animals;
        Flying flying;
        Goose goose = new Goose();
        Airplane airplane = new Airplane();
        Lynx lynx = new Lynx();

        // Accessing Goose methods by using Goose reference variable on Goose object
        goose.speak();
        goose.move();
        goose.fly();

        // Accessing Lynx mehtods by using Lynx reference variable on Lynx Object
        lynx.speak();
        lynx.move();

        // Accessing Airplane methods using Airplane reference variable on Aiprlane Object
        airplane.fly();

        // Accessing move and speak methods by using Animals reference variable on Goose Object
        animals = goose;
        animals.speak();
        animals.move();

        // Accessing move and speak methods by using Animals reference variable on Lynx Object
        animals = lynx;
        animals.speak();
        animals.move();   
    
        /*
         * As both goose and lynx overrides the Animals' methods so their methods will be working otherwise the methods
         * inherited from Animals would be working if not overriden(as the methods are public in Animals Interface).
         */

         // Accessing fly method by using Flying reference variable on Goose, Airplane Objects
         flying = goose;
         flying.fly();

         flying = airplane;
         flying.fly();
    }
}
