public class Rational 
{
    private int numerator;
    private int denominator;

    // Constructor to initialize Rational object with given numerator and denominator
    public Rational(int numerator, int denominator)
    {
        if(denominator == 0)
        {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        int gcd = gcd(Math.abs(numerator), Math.abs(denominator));
        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;
    }

    // No-argument constructor with default values
    public Rational()
    {
        this(0, 1);
    } 

    // Static method to add two Rational numbers
    public static Rational add(Rational r1, Rational r2)
    {
        int numerator = (r1.getNumerator() * r2.getDenominator()) + (r2.getNumerator() * r1.getDenominator());
        int denominator = r1.getDenominator() * r2.getDenominator();
        return new Rational (numerator, denominator);
    }

    // Static method to subtract two Rational numbers
    public static Rational sub(Rational r1, Rational r2)
    {
        int numerator = (r1.getNumerator() * r2.getDenominator()) - (r2.getNumerator() * r1.getDenominator());
        int denominator = r1.getDenominator() * r2.getDenominator();
        return new Rational (numerator, denominator);       
    }

    // Static method to multiply two Rational numbers
    public static Rational multiply(Rational r1, Rational r2)
    {
        int numerator = r1.getNumerator() * r2.getNumerator();
        int denominator = r1.getDenominator() * r2.getDenominator();
        return new Rational (numerator, denominator);       
    }

    // Static method to divide two Rational numbers
    public static Rational divide(Rational r1, Rational r2)
    {
        if(r2.getNumerator() == 0)
        {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        int numerator = r1.getNumerator() * r2.getDenominator();
        int denominator = r1.getDenominator() * r2.getNumerator();
        return new Rational(numerator, denominator);
    }

    // Method to return a String representation of Rational number in the form a/b
    @Override
    public String toString() 
    {
        return String.format("%s" ,numerator + "/" + denominator);
    }

    // Method to return a String representation of Rational number in floating-point format
    public String toFloatString(int precision) 
    {
        double value = (double) numerator / denominator;
        return String.format("%." + precision + "f", value);
    }

    // Method to find greatest common divisor
    private int gcd (int numerator, int denominator)
    {
        while(denominator != 0)
        {
            int temp = denominator;
            denominator = numerator % denominator;
            numerator = temp;
        }
        return numerator;
    }

    public int getNumerator() 
    {
        return numerator;
    }

    public int getDenominator() 
    {
        return denominator;
    }

}
