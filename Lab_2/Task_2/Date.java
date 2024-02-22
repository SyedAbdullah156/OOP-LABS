
public class Date 
{
    // Instance Variables
    private int month;
    private int day;
    private int year;
    // Constructor
    public Date (int month, int day, int year)
    {
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
    // Method for displaying date
    public void displayDate()
    {
        System.out.printf("%02d/%02d/%04d%n", month, day, year);
    }
}
