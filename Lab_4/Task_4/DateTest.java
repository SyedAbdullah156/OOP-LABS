/*
 * (Date Class) Create class Date with the following capabilities:
a)	Output the date in multiple formats, such as 
    MM/DD/YYYY
    June 14, 1992
    DDD YYYY
b)	Use overloaded constructors to create Date objects initialized with dates of the formats in part (a). 
    In the first case the constructor should receive three integer values. In the second case it should receive a 
    String and two integer values. In the third case it should receive two integer values, the first of which represents 
    the day number in the year. [Hint: To convert the String representation of the month to a numeric value, compare 
    Strings using the equals method. For example, if s1 and s2 are Strings, the method call s1.equals(s2) returns true 
    if the Strings are identical and otherwise returns false.]

 */
public class DateTest 
{
    public static void main(String[] args) 
    {
        // Testing the Date class
        Date date1 = new Date(6, 14, 1992);
        Date date2 = new Date("June", 14, 1992);
        Date date3 = new Date(166, 1992);

        // Outputting dates in multiple formats
        System.out.println("Date in MM/DD/YYYY format: " + date1.printDate1());
        System.out.println("Date in June 14, 1992 format: " + date2.printDate2());
        System.out.println("Date in DDD YYYY format: " + date3.printDate3());
    }
}
