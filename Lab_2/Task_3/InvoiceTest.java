/*(Invoice Class) Create a class called Invoice that a hardware store might use to represent an invoice for an item 
sold at the store. An Invoice should include four pieces of information as instance variables—a part number (type 
String), a part description (type String), a quantity of the item being purchased (type int) and a price per item 
(double). Your class should have a constructor that initializes the four instance variables. Provide a set and a 
get method for each instance variable. In addition, provide a method named getInvoiceAmount that calculates the 
invoice amount (i.e., multiplies the quantity by the price per item), then returns the amount as a double value. 
If the quantity is not positive, it should be set to 0. If the price per item is not positive, it should be set to 
0.0. Write a test app named InvoiceTest that demonstrates class Invoice’s capabilities. */
import java.util.Scanner;
public class InvoiceTest 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the part number of the item: ");
        String partNumber = input.nextLine();
        System.out.print("Enter the part description of the item: ");
        String partDescription = input.nextLine();
        System.out.print("Enter the qunatity purchased: ");
        int quantityPurchased = input.nextInt();
        System.out.print("Enter the price per item: ");
        double pricePerItem = input.nextDouble();
        Invoice myInvoice = new Invoice(partNumber, partDescription, quantityPurchased, pricePerItem);
        System.out.printf("So the information is %n Part Number: %s%n Part Description: %s%n Quantity Purchased: %d%n Price Per Item: %.2f%n Total Amount: %.2f%n", myInvoice.getPartNumber(), myInvoice.getPartDescription(),myInvoice.getQuantityPurchased(), myInvoice.getPricePerItem(), myInvoice.getInvoiceAmount());
        input.close();
    }
}
