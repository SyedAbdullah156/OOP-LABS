package Lab_2.Task_4;

public class HeartRates 
{
    // Instance Variables
    private int month;
    private int day;
    private int year;
    private String firstName;
    private String lastName;
    // Constructor
    public HeartRates (String firstName, String lastName, int month, int day, int year)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        if(month > 0 && month < 13)
        {
            this.month = month;
        }
        if(day > 0 && day < 31)
        {
            this.day = day;
        }
        if(year > 0)
        {
            this.year = year;
        }

    }
    // Methods for firstName
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    public String getFirstName()
    {
        return firstName;
    }
    // Methods for lastName
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    public String getLastName()
    {
        return lastName;
    }
    // Methods for month
    public void setMonth(int month)
    {
        if(month > 0 && month < 31)
        {
            this.month = month;
        }
    }
    public int getMonth()
    {
        return month;
    }
    // Methods for day
    public void setDay(int day)
    {
        if(day > 0 && day < 31)
        {
            this.day = day;
        }
    }
    public int getDate()
    {
        return day;
    }
    // Methods for year
    public void setYear(int year)
    {
        if(year > 0)
        {
            this.year = year;
        }
    }
    public int getYear()
    {
        return year;
    }
    // Method for age
    public int getAge()
    {
        return java.time.Year.now().getValue() - year;
    }
    // Method for Maximum Heart Rate
    public int maxHeartRate()
    {
        return 220 - getAge();
    }
    // Method for Target Heart rate
    public void targetHeartRate()
    {
        System.out.printf("%.0f - %.0f", maxHeartRate() * 0.5, maxHeartRate() * 0.85);
    }
}
