package Lab_6.Task_2;

public class MP3Player extends Electronics
{
    private String color;

    public String getColor() 
    {
        return color;
    }

    public void setColor(String color) 
    {
        this.color = color;
    }

    public MP3Player(double regularPrice, String manufacture, String color)
    {
        super(regularPrice, manufacture);
        this.color = color;
    }

    // Override method for computing sale price
    @Override
    public double computeSalePrice() 
    {
        // Assume 5% discount for MP3 players
        return getRegularPrice() * 0.95;
    }
}