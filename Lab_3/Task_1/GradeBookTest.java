/*Develop a GradeBook class that instructors can use to maintain students’ grades on an exam and display a grade 
report that includes the grades, class average, lowest grade, and the highest grade. This version of class GradeBook
 stores the grades for one exam in a one-dimensional array. Assume 10 students in each course.
Demonstrate the capabilities of the GradeBook class to present the data in a tabular format for few courses in your
 ongoing semester without using array of objects approach. 
 */

public class GradeBookTest 
{
    public static void main(String[] args)
    {
        int[] javaGradesArray = {87, 68, 94, 100, 83, 78, 85, 91, 76, 67};
        int[] linearGradesArray = {95, 85, 75,  65, 45, 87, 75, 34, 56, 100};

        GradeBook javaGradeBook = new GradeBook("JAVA", javaGradesArray);
        GradeBook linearGradeBook = new GradeBook("Linear Algebra", linearGradesArray);

        System.out.print("Welcome to grade book for \n" + javaGradeBook.getCourseName() + "\n\n");
        javaGradeBook.processGrades();

        System.out.print("Welcome to grade book for \n" + linearGradeBook.getCourseName() + "\n\n");
        linearGradeBook.processGrades();
    }
}

