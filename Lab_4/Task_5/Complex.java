package Lab_4.Task_5;

public class Complex 
{
    private double realPart;
    private double imgPart;

    public Complex(double realPart, double imgPart)
    {
        this.realPart = realPart;
        this.imgPart = imgPart;
    }

    public Complex()
    {
        this.realPart = 0.0;
        this.imgPart = 0.0;
    }

    public static void addComplex(Complex c1, Complex c2)
    {
        System.out.printf("(%.2f + %.2fi) + (%.2f + %.2fi): (%.2f + %.2fi)", c1.realPart, c1.imgPart, c2.realPart, c2.imgPart, (c1.realPart + c2.realPart), (c1.imgPart + c2.imgPart));
    }

    public static void subComplex(Complex c1, Complex c2)
    {
        System.out.printf("(%.2f + %.2fi) + (%.2f + %.2fi): (%.2f + %.2fi)", c1.realPart, c1.imgPart, c2.realPart, c2.imgPart, (c1.realPart - c2.realPart), (c1.imgPart - c2.imgPart));
    }

    public void printComplex()
    {
        System.out.printf("(%.2f , %.2f)", realPart, imgPart);
    }
    
}
