package Lab_2.Task_3;

public class Invoice 
{
    private String partNumber;
    private String partDescription;
    private int quantityPurchased;
    private double pricePerItem;

    // Constructor that intialized the values of the instance variables 
    public Invoice (String partNumber, String partDescription, int quantityPurchased, double pricePerItem)
    {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        if(quantityPurchased > 0)
        {
            this.quantityPurchased = quantityPurchased;
        }
        if(pricePerItem > 0.0)
        {
            this.pricePerItem = pricePerItem;
        }
    }
    // Methods for partNumber;
    public void setPartNumber(String partNumber)
    {
        this.partNumber = partNumber;
    }
    public String getPartNumber()
    {
        return partNumber;
    }
    // Methods for partDescription
    public void setPartDescription(String partDescription)
    {
        this.partDescription = partDescription;
    }
    public String getPartDescription()
    {
        return partDescription;
    }
    // Methods for quantityPurchased
    public void setQuantityPurchased(int quantityPurchased)
    {
        if(quantityPurchased > 0)
        {
            this.quantityPurchased = quantityPurchased;
        }
    }
    public int getQuantityPurchased()
    {
        return quantityPurchased;
    }
    //Methods for pricePerItem
    public void setPricePerItem(double pricePerItem)
    {
        if(pricePerItem > 0.0)
        {
            this.pricePerItem = pricePerItem;
        }
    }
    public double getPricePerItem()
    {
        return pricePerItem;
    }
    // Method to get Invoice
    public double getInvoiceAmount()
    {
        double totalAmount = pricePerItem * quantityPurchased;
        if(totalAmount > 0.0)
        {
            return pricePerItem * quantityPurchased;
        }
        return 0.0;
    }
}
