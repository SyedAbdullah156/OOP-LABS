package Lab_8.Task_3;

import java.io.IOException;
public class ExceptionPrecedenceExample 
{
    public static void main(String[] args) 
    {
        try 
        {
            throw new IOException("IO Exception");
        } 
        catch (IOException e) 
        {
            System.out.println("Caught IOException: " + e.getMessage());
        } 
        catch (Exception e) 
        {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}