package Lab_6.Task_2;

public class Book extends Product
{
    private String publisher;
    private int yearPublished;

    public Book(double regularPrice, String publisher, int yearPublished)
    {
        super(regularPrice);
        this.publisher= publisher;
        this.yearPublished = yearPublished;
    }

    // Override method for computing sale price
    @Override
    public double computeSalePrice() 
    {
        // Assume 15% discount for books
        return getRegularPrice() * 0.85;
    }

    public int getYearPublished() 
    {
        return yearPublished;
    }

    public void setYearPublished(int yearPublished) 
    {
        this.yearPublished = yearPublished;
    }

    public String getPublisher() 
    {
        return publisher;
    }

    public void setPublisher(String publisher) 
    {
        this.publisher = publisher;
    }
    
}
