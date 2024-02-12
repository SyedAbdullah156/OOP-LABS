/*
 * (Palindromes) A palindrome is a sequence of characters that reads the same backward as forward. For example, 
 * each of the following five-digit integers is a palindrome: 12321, 55555, 45554 and 11611. Write an application 
 * that reads in a five-digit integer and determines whether it’s a palindrome. If the number is not five digits 
 * long, display an error message and allow the user to enter a new value.
 */
import java.util.Scanner;
public class Task_5 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int length = 0;
        int number = 0;
        int copy = 0;

        while(length != 5)
        {
            System.out.print("Enter the number: ");
            number = input.nextInt();

            length = 0;// We have re-initialized after every loop or it be get increasing till end of program
            copy = number;
            while(copy > 0)
            {
                copy /= 10;
                length++;
            }
        }

        copy = number;

        int reverse = 0;
        while(number > 0)
        {
            int digit = number % 10;
            number /= 10;
            reverse = reverse * 10 + digit;
        }

        if(reverse == copy)
        {
            System.out.print("The number entered is palindrome.");
        }
        else
        {
            System.out.print("The number entered is not palindrome.");
        }
        input.close();
    }
}
