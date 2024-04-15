package Lab_8.Task_1;

import java.util.Scanner;
public class NegativeArraySizeExample 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        try 
        {
            if (size < 0) 
            {
                throw new NegativeArraySizeException("Array size cannot be negative");
            }
            @SuppressWarnings("unused")
            int[] array = new int[size];
            System.out.println("Array created successfully!");
        } 
        catch (NegativeArraySizeException e) 
        {
            System.out.println("Exception caught: " + e.getMessage());
        }
        finally
        {
            scanner.close();
        }
    }
}