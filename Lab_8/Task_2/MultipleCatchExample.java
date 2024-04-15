package Lab_8.Task_2;

public class MultipleCatchExample 
{
    public static void main(String[] args) 
    {
        try 
        {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[4]); // Accessing an invalid index
        } 
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("Array index out of bounds: " + e.getMessage());
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("Arithmetic exception occurred: " + e.getMessage());
        } 
        catch (Exception e) 
        {
            System.out.println("An exception occurred: " + e.getMessage());
        }
    }
}