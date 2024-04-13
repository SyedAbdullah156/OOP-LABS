package Lab_2.Task_5;

/*(Computerization of Health Records) A health-care issue that has been in the news lately is the computerization of
health records. This possibility is being approached cautiously because of sensitive privacy and security concerns,
among others. [We address such concerns in later exercises.] Computerizing health records could make it easier for
patients to share their health profiles and histories among their various health-care professionals. This could 
improve the quality of health care, help avoid drug conflicts and erroneous drug prescriptions, reduce costs and,
in emergencies, could save lives. In this exercise, you’ll design a “starter” HealthProfile class for a person. 
The class attributes should include the person’s first name, last name, gender, date of birth (consisting of 
separate attributes for the month, day and year of birth), height (in inches) and weight (in pounds). Your class
should have a constructor that receives this data. For each attribute, provide set and get methods.The class 
also should include methods that calculate and return the user’s age in years, maximum heart rate and target-
heart-rate range (see Exercise 3.16), and body mass index (BMI; see Exercise 2.33).Write a Java app that prompts for
the person’s information, instantiates an object of class HealthProfile for that person and prints the information 
from that object—including the person’s first name, last name, gender, date of birth, height and weight—then 
calculates and prints the person’s age in years, BMI, maximum heart rate and target-heart-rate range. It should 
also display the BMI values chart from Exercise 2.33. 
 */
import java.util.Scanner;

public class HealthProfileTest 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        // Prompt for user input
        System.out.println("Enter person's information:");
        System.out.print("First Name: ");
        String firstName = scanner.nextLine();
        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();
        System.out.print("Gender: ");
        String gender = scanner.nextLine();
        System.out.print("Birth Month (1-12): ");
        int birthMonth = scanner.nextInt();
        System.out.print("Birth Day: ");
        int birthDay = scanner.nextInt();
        System.out.print("Birth Year: ");
        int birthYear = scanner.nextInt();
        System.out.print("Height (in inches): ");
        double heightInches = scanner.nextDouble();
        System.out.print("Weight (in pounds): ");
        double weightPounds = scanner.nextDouble();

        // Create HealthProfile object
        HealthProfile profile = new HealthProfile(firstName, lastName, gender, birthMonth, birthDay, birthYear, heightInches, weightPounds);

        // Print person's information
        System.out.println("\nPerson's Information:");
        System.out.println("First Name: " + profile.getFirstName());
        System.out.println("Last Name: " + profile.getLastName());
        System.out.println("Gender: " + profile.getGender());
        System.out.println("Date of Birth: " + profile.getBirthMonth() + "/" + profile.getBirthDay() + "/" + profile.getBirthYear());
        System.out.println("Height (in inches): " + profile.getHeightInches());
        System.out.println("Weight (in pounds): " + profile.getWeightPounds());

        // Calculate and print age
        int age = profile.getAge();
        System.out.println("\nAge: " + age + " years");

        // Calculate and print BMI
        double bmi = profile.calculateBMI();
        System.out.println("BMI: " + bmi);

        // Calculate and print maximum heart rate
        int maxHeartRate = profile.maxHeartRate();
        System.out.println("Maximum Heart Rate: " + maxHeartRate);

        // Calculate and print target heart rate range
        System.out.print("Target Heart Rate Range: ");
        profile.targetHeartRate();
        System.out.println();

        // Display BMI values chart
        System.out.println("\nBMI Values Chart:");
        System.out.println("Underweight: less than 18.5");
        System.out.println("Normal:      between 18.5 and 24.9");
        System.out.println("Overweight:  between 25 and 29.9");
        System.out.println("Obese:       30 or greater");
        
        scanner.close();
    }
}

