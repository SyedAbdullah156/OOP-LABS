package Lab_6.Task_2;

public abstract class Electronics extends Product
{
    private String manufacture;

    public Electronics(double regularPrice, String manufacture)
    {
        super(regularPrice);
        this.manufacture = manufacture;
    }

    public String getManufacture() 
    {
        return manufacture;
    }

    public void setManufacture(String manufacture) 
    {
        this.manufacture = manufacture;
    }
    
}
