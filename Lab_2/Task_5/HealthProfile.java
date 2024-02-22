
public class HealthProfile 
{
    private String firstName;
    private String lastName;
    private String gender;
    private int birthMonth;
    private int birthDay;
    private int birthYear;
    private double heightInches;
    private double weightPounds;

    public HealthProfile(String firstName, String lastName, String gender, int birthMonth, int birthDay, int birthYear, double heightInches, double weightPounds) 
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;

        if(birthMonth > 0 && birthMonth < 13)
            this.birthMonth = birthMonth;

        if(birthDay > 0 && birthDay < 31)
            this.birthDay = birthDay;

        if(birthYear > 0 && birthYear < 2025)
            this.birthYear = birthYear;
        
        if(heightInches > 0.0)
            this.heightInches = heightInches;

        if(weightPounds > 0.0)
            this.weightPounds = weightPounds;
    }

    public String getFirstName() 
    {
        return firstName;
    }

    public void setFirstName(String firstName) 
    {
        this.firstName = firstName;
    }

    public String getLastName() 
    {
        return lastName;
    }

    public void setLastName(String lastName) 
    {
        this.lastName = lastName;
    }

    public String getGender() 
    {
        return gender;
    }

    public void setGender(String gender) 
    {
        this.gender = gender;
    }

    public int getBirthMonth() 
    {
        return birthMonth;
    }

    public void setBirthMonth(int birthMonth) 
    {
        if(birthMonth > 0 && birthMonth < 13)
            this.birthMonth = birthMonth;
    }

    public int getBirthDay() 
    {
        return birthDay;
    }

    public void setBirthDay(int birthDay) 
    {
        if(birthDay > 0 && birthDay < 31)
            this.birthDay = birthDay;
    }

    public int getBirthYear() 
    {
        return birthYear;
    }

    public void setBirthYear(int birthYear) 
    {
        if(birthYear > 0 && birthYear < 2025)
            this.birthYear = birthYear;
    }

    public double getHeightInches() 
    {
        return heightInches;
    }

    public void setHeightInches(double heightInches) 
    {
        if(heightInches > 0.0)
            this.heightInches = heightInches;
    }

    public double getWeightPounds() 
    {
        return weightPounds;
    }

    public void setWeightPounds(double weightPounds) 
    {
        if(weightPounds > 0.0)
            this.weightPounds = weightPounds;
    }

    // Method for age
    public int getAge()
    {
        return java.time.Year.now().getValue() - birthYear;
    }
    // Method for Maximum Heart Rate
    public int maxHeartRate()
    {
        return 220 - getAge();
    }
    // Method for Target Heart rate
    public void targetHeartRate()
    {
        System.out.printf("%.0f - %.0f", maxHeartRate() * 0.5, maxHeartRate() * 0.8);
    }
    // Method for BMI
    public double calculateBMI() 
    {
        double heightInMeters = heightInches * 0.0254; // Convert height from inches to meters
        return weightPounds / (heightInMeters * heightInMeters); // BMI formula
    }


}

