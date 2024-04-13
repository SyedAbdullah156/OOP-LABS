package Lab_5.Task_3;

class GeometricObject
{
    private String color;
    private boolean filled;
    private java.util.Date dateCreated ;

    public GeometricObject()
    {
        this.color = null;
        this.filled = false;
        this.dateCreated = null;
    }

    public GeometricObject(String color, boolean filled, java.util.Date dateCreated)
    {
        this.color = color;
        this.filled = filled;
        this.dateCreated = dateCreated;
    }

    public String getColor() 
    {
        return color;
    }

    public void setColor(String color) 
    {
        this.color = color;
    }

    public boolean isFilled() 
    {
        return filled;
    }

    public void setFilled(boolean filled) 
    {
        this.filled = filled;
    }

    public java.util.Date getDateCreated()
    {
        return dateCreated;
    }

    public void setDateCreated(java.util.Date dateCreated) 
    {
        this.dateCreated = dateCreated;
    }

    public String toString()
    {
        return String.format("%s: %s%n%s: %s%n%s: %s", "Color", getColor(), "Filled", isFilled(), "Date", getDateCreated());
    }
}
class Circle extends GeometricObject
{
    private double radius;

    public Circle(double radius)
    {
        super();
        this.radius = radius;
    }

    public Circle(String color, boolean filled, java.util.Date dateCreated, double radius)
    {
        super(color, filled, dateCreated);
        this.radius = radius;
    }

    public double getRadius() 
    {
        return radius;
    }

    public void setRadius(double radius) 
    {
        this.radius = radius;
    }

    public double getArea()
    {
        return Math.PI * radius * radius;
    }

    public double getPerimeter()
    {
        return 2 * Math.PI * radius;
    }

    public double getDiameter()
    {
        return 2 * radius;
    }

    public void printCircle(int radius) 
    {
        int diameter = 2 * radius;
        int centerX = radius;
        int centerY = radius;

        for (int y = 0; y <= diameter; y++) 
        {
            for (int x = 0; x <= diameter; x++) 
            {
                int distance = (int) Math.sqrt(Math.pow(x - centerX, 2) + Math.pow(y - centerY, 2));
                if (distance > radius - 0.5 && distance < radius + 0.5) 
                {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public String toString()
    {
        return "Circle: radius = " + radius;
    }
}
class Rectangle extends GeometricObject
{
    private double width;
    private double height;

    public Rectangle()
    {
        this.width = 1.0;
        this.height = 1.0;
    }

    public Rectangle(String color, boolean filled, java.util.Date dateCreated, double width, double height)
    {
        super(color, filled, dateCreated);
        this.width = width;
        this.height = height;
    }

    public double getWidth() 
    {
        return width;
    }

    public void setWidth(double width) 
    {
        this.width = width;
    }
    
    public double getHeight() 
    {
        return height;
    }

    public void setHeight(double height) 
    {
        this.height = height;
    }

    public double getArea()
    {
        return width * height;
    }

    public double getPerimeter()
    {
        return 2 * width + 2 * height;
    }

    public String toString()
    {
        return "Rectangle: width = " + width + " height = " + height;
    }
}

public class Main {
    public static void main(String[] args) {
        // Test cases for Circle
        Circle circle1 = new Circle(5);
        circle1.setColor("Red");
        circle1.setFilled(true);
        circle1.setDateCreated(new java.util.Date());
        
        Circle circle2 = new Circle("Blue", false, new java.util.Date(), 7);
        
        System.out.println("Circle 1:");
        System.out.println(circle1);
        System.out.println("Area: " + circle1.getArea());
        System.out.println("Perimeter: " + circle1.getPerimeter());
        System.out.println("Diameter: " + circle1.getDiameter());
        System.out.println();
        
        System.out.println("Circle 2:");
        System.out.println(circle2);
        System.out.println("Area: " + circle2.getArea());
        System.out.println("Perimeter: " + circle2.getPerimeter());
        System.out.println("Diameter: " + circle2.getDiameter());
        System.out.println();
        
        // Test cases for Rectangle
        Rectangle rectangle1 = new Rectangle();
        rectangle1.setColor("Green");
        rectangle1.setFilled(true);
        rectangle1.setDateCreated(new java.util.Date());
        rectangle1.setWidth(3);
        rectangle1.setHeight(4);
        
        Rectangle rectangle2 = new Rectangle("Yellow", false, new java.util.Date(), 5, 6);
        
        System.out.println("Rectangle 1:");
        System.out.println(rectangle1);
        System.out.println("Area: " + rectangle1.getArea());
        System.out.println("Perimeter: " + rectangle1.getPerimeter());
        System.out.println();
        
        System.out.println("Rectangle 2:");
        System.out.println(rectangle2);
        System.out.println("Area: " + rectangle2.getArea());
        System.out.println("Perimeter: " + rectangle2.getPerimeter());
        System.out.println();
    }
}
