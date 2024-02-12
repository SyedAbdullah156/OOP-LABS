/* Program: Writing a program that stores a student’s year (Freshman, Sophomore, Junior, or Senior), the number of courses 
the student is taking, and his or her GPA on a 4.0 scale. Declare variables with the appropriate names and types 
to hold this information. Print the stored information at the end.*/

import java.util.Scanner;
public class Task_1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
       
        System.out.print("Enter the year: ");
        int year = input.nextInt();

        System.out.print("Enter the no of courses: ");
        int courses = input.nextInt();

        System.out.print("Enter your GPA(on a 4.0 scale): ");
        double gpa = input.nextDouble();

        System.out.printf("So your information is:\n1.Year: %d\n2.Courses: %d\n3.GPA: %.2f", year, courses, gpa);
        input.close();
    }
}