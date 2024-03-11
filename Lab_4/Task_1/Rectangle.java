public class Rectangle 
{
    private double length;
    private double width;

    public Rectangle()
    {
        length = 1.0;
        width = 1.0;
    }

    public double perimeter()
    {
        return (2 * length) + (2 * width);
    }

    public double area()
    {
        return length * width;
    }

    public void setLength(double length)
    {
        if(length > 0.0 && length < 20.0)
            this.length = length;
        else
            throw new IllegalArgumentException("The length and width should be between 1 and 20.");
    }
    public double getLength()
    {
        return length;
    }

    public void setWidth(double width)
    {
        if(width > 0.0 && width < 20.0)
        {
            this.width = width;
        }
    }
    public double getWidth()
    {
        return width;
    }
}


