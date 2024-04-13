package Lab_4.Task_4;

public class Date 
{
    private int month;
    private int day;
    private int year;

    // Array to store month names
    private static final String[] MONTH_NAMES = 
    {
        "", "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };

    // Constructor to initialize Date object with three integer values (MM/DD/YYYY format)
    public Date(int month, int day, int year) 
    {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    // Constructor to initialize Date object with a String and two integer values (June 14, 1992 format)
    public Date(String monthName, int day, int year) 
    {
        for (int i = 1; i < MONTH_NAMES.length; i++) 
        {
            if (MONTH_NAMES[i].equalsIgnoreCase(monthName)) 
            {
                this.month = i;
                break;
            }
        }
        this.day = day;
        this.year = year;
    }

    // Constructor to initialize Date object with two integer values (DDD YYYY format)
    public Date(int dayOfYear, int year) 
    {
        this.year = year;
        int daysCount = 0;
        for (int i = 1; i <= 12; i++) 
        {
            for (int j = 1; j <= daysInMonth(i, year); j++) 
            {
                daysCount++;
                if (daysCount == dayOfYear) 
                {
                    this.month = i;
                    this.day = j;
                    return;
                }
            }
        }
        throw new IllegalArgumentException("Invalid day of year: " + dayOfYear);
    }

    // Method to get the number of days in a given month of a given year
    private int daysInMonth(int month, int year) 
    {
        if (month == 2) 
        {
            if (isLeapYear(year)) 
            {
                return 29;
            } 
            else 
            {
                return 28;
            }
        } 
        else if (month == 4 || month == 6 || month == 9 || month == 11) 
        {
            return 30;
        } 
        else 
        {
            return 31;
        }
    }

    // Method to check if a year is a leap year
    private boolean isLeapYear(int year) 
    {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to output the date in MM/DD/YYYY format
    public String printDate1() 
    {
        return String.format("%02d/%02d/%04d", month, day, year);
    }

    // Method to output the date in June 14, 1992 format
    public String printDate2() 
    {
        return String.format("%s %d, %04d", MONTH_NAMES[month], day, year);
    }

    // Method to output the date in DDD YYYY format
    public String printDate3() 
    {
        int daysCount = day;
        for (int i = 1; i < month; i++) 
        {
            daysCount += daysInMonth(i, year);
        }
        return String.format("%d %04d", daysCount, year);
    }
}
