package Lab_8.Task_5;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsExample 
{
    public static void main(String[] args) 
    {
        try 
        {
            readFile("example.txt");
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("File not found: " + e.getMessage());
        }
    }

    public static void readFile(String filename) throws FileNotFoundException 
    {
        FileReader fileReader = new FileReader(filename);
        // Code to read the file
    }
}