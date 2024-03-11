/*
 * (Rational Numbers) Create a class called Rational for performing arithmetic with fractions. Write a program to 
 * test your class. Use integer variables to represent the private instance variables of the class—the numerator and 
 * the denominator. Provide a constructor that enables an object ofthis class to be initialized when it’s declared. 
 * The constructor should store the fraction in reduced form. The fraction 2/4 is equivalent to 1/2 and would be 
 * stored in the object as 1 in the numerator and 2 in the denominator. Provide a no-argument constructor with 
 * default values in case no initializers are provided. Provide public methods that perform each of the following 
 * operations:

a)	Add two Rational numbers: The result of the addition should be stored in reduced form. Implement this as a   static method. 
b)	Subtract two Rational numbers: The result of the subtraction should be stored in reduced form. Implement this as a static method.
c)	Multiply two Rational numbers: The result of the multiplication should be stored in reduced form. Implement this as a static method.
d)	Divide two Rational numbers: The result of the division should be stored in reduced form. Implement this as a static method.
e)	Return a String representation of a Rational number in the form a/b, where a is the numerator and b is the denominator.
f)	Return a String representation of a Rational number in floating-point format. (Consider providing formatting capabilities that enable the user of the class to specify the number of digits of precision to the right of the decimal point.)

 */

public class RationalTest 
{
    public static void main(String[] args)
    {
        Rational r1 = new Rational(9, 3);
        Rational r2 = new Rational(4 , 6);

        System.out.println(r1);
        System.out.println(r2);

        System.out.println("Addition: " + Rational.add(r1, r2));
        System.out.println("Subtraction: " + Rational.sub(r1, r2));
        System.out.println("Multipilication: " + Rational.multiply(r1, r2));
        System.out.println("Division: " + Rational.divide(r1, r2));


        // Testing the toFloatString method
        System.out.println("r1 in floating-point format (2 digits precision): " + r1.toFloatString(2)); // Output: 0.50
        System.out.println("r2 in floating-point format (3 digits precision): " + r2.toFloatString(3)); // Output: 0.667
    }
}
