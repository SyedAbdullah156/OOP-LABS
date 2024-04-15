package Lab_8.Task_4;

public class FinallyExample 
{
    public static void main(String[] args) 
    {
        try 
        {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("Arithmetic exception occurred: " + e.getMessage());
        } 
        finally 
        {
            System.out.println("Finally block executed");
        }
    }
    public static int divide(int a, int b) 
    {
        return a / b;
    }
}