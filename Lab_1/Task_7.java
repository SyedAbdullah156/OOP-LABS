/* (Factorial) Write an application that reads a nonnegative integer and computes and prints its factorial. */
public class Task_7 
{
    public static void main(String[] args)
    {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = input.nextInt();

        if(number > -1)
        {
            long factorial = 1;
            for(int i = 1; i <= number; i++)
            {
                factorial *= i;
            }
            System.out.printf("The factorial of the number is: %d", factorial);
        }
        else
        {
            System.out.print("No factorial of negative number.");
        }
        input.close();
    }
}
