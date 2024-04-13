package Lab_2.Task_4;

/*(Target-Heart-Rate Calculator) While exercising, you can use a heart-rate monitor to see that your heart rate 
stays within a safe range suggested by your trainers and doctors. According to the American Heart Association (AHA) 
(www.americanheart.org/presenter.jhtml?identifier=4736), the formula for calculating your maximum heart rate in 
beats per minute is 220 minus your age in years. Your target heart rate is a range that’s 50–85% of your maximum 
heart rate. [Note: These formulas are estimates provided by the AHA. Maximum and target heart rates may vary based 
on the health, fitness and gender of the individual. Always consult a physician or qualified health-care professional
before beginning or modifying an exercise program.] Create a class called HeartRates. The class attributes should
include the person’s first name, last name and date of birth (consisting of separate attributes for the month, 
day and year of birth). Your class should have a constructor that receives this data as parameters. For each 
attribute provide set and get methods. The class also should include a method that calculates and returns the 
person’s age (in years), a method that calculates and returns the person’s maximum heart rate and a method that 
calculates and returns the person’s target heart rate. Write a Java app that prompts for the person’s information,
instantiates an object of class HeartRates and prints the information from that object—including the person’s 
first name, last name and date of birth—then calculates and prints the person’s age in (years), maximum heart 
rate and target-heart-rate range.
*/

public class HeartRatesTest
{
    public static void main(String[] args)
    {
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = input.nextLine();
        System.out.print("Enter your last name: ");
        String lastName = input.nextLine();
        System.out.print("Enter your day of birth: ");
        int date = input.nextInt();
        System.out.print("Enter your month of birth: ");
        int month = input.nextInt();
        System.out.print("Enter your year of birth: ");
        int year = input.nextInt();
        HeartRates myHeartRates = new HeartRates(firstName, lastName, month, date, year);
        System.out.printf("%s %s who was born on %02d/%02d/%04d has%n Age: %d%n Maximum Heart Rate: %d%n Target Heart Rate:", myHeartRates.getFirstName(), myHeartRates.getLastName(), myHeartRates.getMonth(), myHeartRates.getDate(), myHeartRates.getYear(), myHeartRates.getAge(), myHeartRates.maxHeartRate());
        myHeartRates.targetHeartRate();
        input.close();
    }
}