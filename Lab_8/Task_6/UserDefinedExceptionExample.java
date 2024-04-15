package Lab_8.Task_6;

class MyCustomException extends Exception 
{
    public MyCustomException(String message) 
    {
        super(message);
    }
}
public class UserDefinedExceptionExample 
{
    public static void main(String[] args) 
    {
        try
        {
            int age = 15;
            if (age < 18) 
            {
                throw new MyCustomException("You must be at least 18 years old.");
            }
            System.out.println("Access granted!");
        } 
        catch (MyCustomException e) 
        {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}