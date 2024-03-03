package Task_2;
/*
 * Use the array of objects approach to demonstrate the capabilities of the GradeBook class to present the data in 
 * a tabular format for all the courses that you have studied so far in the 1st and 2nd semester.
 */
import java.security.SecureRandom;
public class GradeBookTest 
{
    private static final SecureRandom randomNumbers = new SecureRandom();
    public static void main(String[] args)
    {

        int[][][] allCoursesGrades = new int[2][5][10];
        for (int semester = 0; semester < allCoursesGrades.length; semester++) // WE HAVE 2 2D ARRAYS FOR EACH SEMESTER
        {
            for (int course = 0; course < allCoursesGrades[semester].length; course++) // WE HAVE 5 1D ARRAYS IN EACH 2D ARRAY FOR EACH COURSE
            {
                for (int grade = 0; grade < allCoursesGrades[semester][course].length; grade++) // WE HAVE 10 ELEMENTS IN EACH 1D ARRAY FOR 10 TEAT IN EACH COURSE
                {
                    allCoursesGrades[semester][course][grade] = randomNumbers.nextInt(100) + 1; // Random grade between 1 and 100
                }
            }
        }

        String[][] allCoursesNames = 
        {
            {"Disc Maths", "Calculus", "FOP", "ICT", "Functional ENglish"},
            {"OOP", "Linear Algebra", "Mulivariable Calculus", "Database", "DLD"}
        };

        GradeBook[][] allCoursesGradeBook = new GradeBook[2][5];// FOR 2 SEM AND 5 COURSES EACH
        for(int semester = 0; semester < allCoursesGradeBook.length; semester++)
        {
            for(int courses = 0; courses < allCoursesGradeBook[semester].length; courses++)
            {
                allCoursesGradeBook[semester][courses] = new GradeBook(allCoursesNames[semester][courses], allCoursesGrades[semester][courses]);
            }
        }

        for(int semester = 0; semester < allCoursesGradeBook.length; semester++)
        {
            System.out.printf("------------------------Semester %d-----------------------\n", semester + 1);
            for(int courses = 0; courses < allCoursesGradeBook[semester].length; courses++)
            {
                System.out.print("Welcome to grade book for \n" + allCoursesGradeBook[semester][courses].getCourseName() + "\n\n");
                allCoursesGradeBook[semester][courses].processGrades();
            }
        }
    }
}