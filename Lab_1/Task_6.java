package Lab_1;

/*(Printing the Decimal Equivalent of a Binary Number) Write an application that inputs an integer containing 
only 0s and 1s (i.e., a binary integer) and prints its decimal equivalent. [Hint: Use the remainder and division 
operators to pick off the binary number’s digits one at a time, from right to left. In the decimal number system, 
the rightmost digit has a positional value of 1 and the next digit to the left a positional value of 10, then 100, 
then 1000, and so on. The decimal number 234 can be interpreted as 4 * 1 + 3 * 10 + 2 * 100. In the binary number 
system, the rightmost digit has a positional value of 1, the next digit to the left a positional value of 2, then 4,
 then 8, and so on. */
public class Task_6 
{
    public static void main(String[] args)
    {
        java.util.Scanner input = new java.util.Scanner(System.in);
        long binary = 0;
        do
        {
            System.out.print("Enter the binary number: ");
            binary = input.nextLong();
        }while(!checkBinary(binary));

        int base = 2,count = 0,decimal = 0;
        while(binary > 0)
        {
            decimal += (int) ((binary % 10) * Math.pow(base, count++));
            binary /= 10;
        }

        System.out.printf("The decimal equivalent of binary %d is: %d", binary, decimal);
        input.close();
    }

    public static boolean checkBinary(long number)
    {
        while(number > 0)
        {
            if(number % 10 != 0 && number % 10 != 1)
            {
                return false;
            }
            number /= 10;
        }
        return true;
    }
}
