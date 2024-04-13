package Lab_6.Task_2;

public class TV extends Electronics
{
    private int size;

    public TV(double regularPrice, String manufacture, int size)
    {
        super(regularPrice, manufacture);
        this.size = size;
    }

    // Override method for computing sale price
    @Override
    public double computeSalePrice()
    {
        // Assume 10% discount for TVs
        return getRegularPrice() * 0.9;
    }
}
