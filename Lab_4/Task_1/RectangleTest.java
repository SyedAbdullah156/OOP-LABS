/*(Rectangle Class) Create a class Rectangle with attributes length and width, each of which defaults to 1. Provide 
  methods that calculate the rectangle’s perimeter and area. It has set and get methods for both length and width. The
  set methods should verify that length and width are each floating-point numbers larger than 0.0 and less than 20.0.
  Write a program to test class Rectangle. */
public class RectangleTest 
{
    public static void main(String[] args)
    {
        Rectangle myRec = new Rectangle();
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter the lenght and width of the rectnagle: ");
        double length = input.nextDouble();
        myRec.setLength(length);
        double width = input.nextDouble();
        myRec.setWidth(width);
        System.out.printf("The area is : %.2f%nThe perimeter is : %.2f", myRec.area(), myRec.perimeter());
    }
}
