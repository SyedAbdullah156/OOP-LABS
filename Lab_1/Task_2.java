package Lab_1;

/* Write an application that inputs one number consisting of five digits from the user, separates the number into 
its individual digits and prints the digits separated from one another by three spaces each. For example, if the 
user types in the number 42339, the program should print:
4   2   3   3   9
Assume that the user enters the correct number of digits. What happens when you execute the program and type a 
number with more than five digits? What happens when you execute the program and type a number with fewer than 
five digits? 
 */
import java.util.Scanner;
public class Task_2 
{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a 5 digit number: ");
        int number = input.nextInt();
        int copy = number;
        int length = 0;
        while(copy > 0){
            copy /= 10;
            length++;
        }
        int div = 1;
        while(length - 1 > 0){
            div *= 10;
            length--;
        }
        while(number > 0){
            int digit = number / div;
            number %= div;
            div /= 10;
            System.out.printf("%d ", digit);
        }
        input.close();
    }
}
