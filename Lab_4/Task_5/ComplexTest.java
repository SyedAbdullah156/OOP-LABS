/*
(Complex Numbers) Create a class called Complex for performing arithmetic with complex numbers. Complex numbers have the form
realPart + imaginaryPart * I  ,where i is
Write a program to test your class. Use floating-point variables to represent the private data of the class. Provide 
a constructor that enables an object of this class to be initialized when it’s declared. Provide a no-argument 
constructor with default values in case no initializers are provided. Provide public methods that perform the 
following operations:
a)	Add two Complex numbers: The real parts are added together and the imaginary parts are added together.
b)	Subtract two Complex numbers: The real part of the right operand is subtracted from the real part of the left operand, and the imaginary part of the right operand is subtracted from the imaginary part of the left operand.
c)	Print Complex numbers in the form (realPart, imaginaryPart).

 */
public class ComplexTest 
{
    public static void main(String[] args)
    {
        Complex c1 = new Complex(1, 3);
        Complex c2 = new Complex(2.4, 7.8);

        System.out.println("The values of the complex numbers are :");
        System.out.print("C1: "); c1.printComplex();
        System.out.println();
        System.out.print("C2: "); c2.printComplex();
        System.out.println();
        Complex.addComplex(c1, c2);
        System.out.println();
        Complex.subComplex(c1, c2);

        /*
         * Or you can do 
         * c1.addComplex(c1, c2);
         * c2.addComplex(c1, c2);
         * But it's not advised
         */
    }
}