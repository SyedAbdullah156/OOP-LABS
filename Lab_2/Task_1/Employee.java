package Lab_2.Task_1;

public class Employee 
{
    private String firstName;
    private String lastName;
    private double monthlySalary;

    Employee(String firstName, String lastName, double monthlySalary)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
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

     // Methods for firstName 
    public void setMonthlySalaray(double monthlySalary)
    {
        if(monthlySalary > 0.0)
            this.monthlySalary = monthlySalary;
    }
    public double getMonthlySalary()
    {
        return monthlySalary;
    }
    
}
