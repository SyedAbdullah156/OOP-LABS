package Lab_4.Task_2;

public class SavingsAccount 
{
    private static double annualInterestRate;
    private double savingsBalance;

    public SavingsAccount(double savingsBalance)
    {
        this.savingsBalance = savingsBalance;
    }

    public void calculateMonthlyInterest()
    {
        double monthlyInterest = savingsBalance * (annualInterestRate / 12);
        savingsBalance += monthlyInterest;
    }
    
    public static void modifyInterestRate(double annualInterestRate)
    {
        SavingsAccount.annualInterestRate = annualInterestRate;
    }

    public double getSavingsBalance()
    {
        return savingsBalance;
    }
}

