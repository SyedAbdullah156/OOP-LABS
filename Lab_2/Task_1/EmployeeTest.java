package Lab_2.Task_1;
import java.util.Scanner;

/*(Employee Class) Create a class called Employee that includes three instance variables—a first name (type String),
  a last name (type String) and a monthly salary (double). Provide a constructor that initializes the three instance 
  variables. Provide a set and a get method for each instance variable. If the monthly salary is not positive, do not
  set its value. Write a test app named EmployeeTest that demonstrates class Employee’s capabilities. Create two 
  Employee objects and display each object’s yearly salary. Then give each Employee a 10% raise and display each 
  Employee’s yearly salary again. */

public class EmployeeTest 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        // Taking information for the 1st Employee
        System.out.print("Enter the first name of the fisrt employee: ");
        String firstName  = input.nextLine();
        System.out.print("Enter the last name of the first employee: ");
        String lastName = input.nextLine();
        System.out.print("Enter your monthly salary of the first employee: ");
        double monthlySalary = input.nextDouble();
        // Creating object for the 1st Employee
        Employee employee1 = new Employee(firstName, lastName, monthlySalary);

        /** Issue
         * For the first employee:
            You use input.nextLine() to read the first name, which works correctly.
            Then, you use input.nextDouble() to read the monthly salary, which leaves a newline character (\n) in the input buffer because after typing the number you type newLine character in order to end the input and that newLine character is left behind in the buffer.
            
            For the second employee:
            When you call input.nextLine() to read the first name of the second employee, it consumes the leftover newline character from the previous input operation and reads it as an empty string.
            As a result, the program doesn't prompt for the first name of the second employee and proceeds to prompt for the last name.

            Result:
            In result we use input.newxtLine() one extra time to consume the left over "\n" in the input buffer.
         */
        input.nextLine();

        // Taking information for the 2nd Employee
        System.out.print("Enter the first name of the second employee: ");
        firstName  = input.nextLine();
        System.out.print("Enter the last name of the second employee: ");
        lastName = input.nextLine();
        System.out.print("Enter your monthly salary of the second employee: ");
        monthlySalary = input.nextDouble();
        // Creating object for the 2nd Employee
        Employee employee2 = new Employee(firstName, lastName, monthlySalary);

        // Displaying Yearly Salary of both Employees
        double employee1YearlySalary = employee1.getMonthlySalary() * 12;
        double employee2YearlySalary = employee2.getMonthlySalary() * 12;
        System.out.printf("%s %s\'s yearly saralry: %.2f%n", employee1.getFirstName(), employee1.getLastName(), employee1YearlySalary);
        System.out.printf("%s %s\'s yearly saralry: %.2f%n", employee2.getFirstName(), employee2.getLastName(), employee2YearlySalary);

        // Displaying the 10% raise in salaries of employees
        System.out.printf("%s %s\'s yearly saralry after raise is : %.2f%n", employee1.getFirstName(), employee1.getLastName(), employee1YearlySalary + employee1YearlySalary * 0.1);
        System.out.printf("%s %s\'s yearly saralry after raise is : %.2f%n", employee2.getFirstName(), employee2.getLastName(), employee2YearlySalary + employee2YearlySalary * 0.1);      

        input.close();
    }
}
