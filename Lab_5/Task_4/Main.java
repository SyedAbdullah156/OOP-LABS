package Lab_5.Task_4;

abstract class Shape 
{
    abstract String getDescription();
}

abstract class TwoDimensionalShape extends Shape 
{
    abstract double getArea();
}

abstract class ThreeDimensionalShape extends Shape 
{
    abstract double getArea();
    abstract double getVolume();
}

class Circle extends TwoDimensionalShape 
{
    private double radius;

    public Circle(double radius) 
    {
        this.radius = radius;
    }

    @Override
    String getDescription() 
    {
        return "Circle";
    }

    @Override
    double getArea() 
    {
        return Math.PI * radius * radius;
    }
}

class Square extends TwoDimensionalShape 
{
    private double side;

    public Square(double side) 
    {
        this.side = side;
    }

    @Override
    String getDescription() 
    {
        return "Square";
    }

    @Override
    double getArea() 
    {
        return side * side;
    }
}

class Sphere extends ThreeDimensionalShape 
{
    private double radius;

    public Sphere(double radius) 
    {
        this.radius = radius;
    }

    @Override
    String getDescription() 
    {
        return "Sphere";
    }

    @Override
    double getArea() 
    {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    double getVolume() 
    {
        return (4.0/3.0) * Math.PI * Math.pow(radius, 3);
    }
}

class Cube extends ThreeDimensionalShape 
{
    private double side;

    public Cube(double side) 
    {
        this.side = side;
    }

    @Override
    String getDescription() 
    {
        return "Cube";
    }

    @Override
    double getArea() 
    {
        return 6 * side * side;
    }

    @Override
    double getVolume() 
    {
        return side * side * side;
    }
}

public class Main 
{
    public static void main(String[] args) 
    {
        Shape[] shapes = {
            new Circle(5),
            new Square(4),
            new Sphere(3),
            new Cube(2)
        };

        for (Shape shape : shapes) 
        {
            System.out.println(shape.getDescription());
            if (shape instanceof TwoDimensionalShape) 
            {
                System.out.println("Area: " + ((TwoDimensionalShape) shape).getArea());
            } else if (shape instanceof ThreeDimensionalShape) 
            {
                System.out.println("Surface Area: " + ((ThreeDimensionalShape) shape).getArea());
                System.out.println("Volume: " + ((ThreeDimensionalShape) shape).getVolume());
            }
            System.out.println();
        }
    }
}
