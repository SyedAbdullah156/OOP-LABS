package Lab_7.Task_1;

import java.util.ArrayList;
import java.util.Scanner;

public class InventoryManager 
{
    private ArrayList<Item> Inventory = new ArrayList<>();
    private Scanner input = new Scanner(System.in);

    public void addItem() 
    {
        // Taking information for adding item
        System.out.print("Enter the Id of the item: ");
        int newId = input.nextInt();
        input.nextLine();

        System.out.print("Enter the Name of the item: ");
        String newName = input.nextLine();

        System.out.print("Enter the Price of the item: ");
        double newPrice = input.nextDouble();
        input.nextLine();

        System.out.print("Enter the Quantity of the item: ");
        int newQuantity = input.nextInt();
        input.nextLine();
        
        for(Item myItem : Inventory)
        {
            if(myItem.getId() == newId)
            {
                throw new IllegalArgumentException("Two items cannot have same id. So change the id of item.");
            }
        }
        this.Inventory.add(new Item(newId, newName, newPrice, newQuantity));
    }

    public void UpdateItem(int itemId)
    {
        // Checking if the item already esxist in the inventory
        for(Item myItem : Inventory)
        {
            if(myItem.getId() == itemId)
            {
                System.out.println("Enter the attribute you want to change for item " + myItem.getId());
                System.out.printf("1.ID\n2.Name\n3.Price\n4.Quantity\nEnter your choice: ");

                int choice = input.nextInt();
                input.nextLine();
                
                switch(choice)
                {
                    case 1:
                    {
                        System.out.print("Enter the new ID of the item: ");
                        int newId = input.nextInt();
                        for(Item idItem : Inventory)
                        {
                            if(newId == idItem.getId())
                            {
                                throw new IllegalArgumentException("Two items cannot have same id. So change the id of item.");
                            }
                        }
                        myItem.setId(newId);
                        break;
                    }
                    case 2:
                    {
                        System.out.print("Enter the new Name of the item: ");
                        String name = input.nextLine();
                        myItem.setName(name);
                        break;
                    }
                    case 3:
                    {
                        System.out.print("Enter the new Price of the item: ");
                        double price = input.nextDouble();
                        if(price < 0.0)
                        {
                            throw new IllegalArgumentException("The price cannot be negative.");
                        }
                        myItem.setPrice(price);
                        break;
                    }
                    case 4:
                    {
                        System.out.print("Enter the new Quantity of the item: ");
                        int quantity = input.nextInt();
                        if(quantity < 0)
                        {
                            throw new IllegalArgumentException("The quantity cannot be negative.");
                        }
                        myItem.setQuantity(quantity);
                        break;
                    }
                }
                return;
            }
        }
        throw new IllegalArgumentException("The specified item does not exist in the Inventory.");
    }
    
    public void removeItem(int itemId)
    {
        for(Item myItem : Inventory)
        {
            if(myItem.getId() == itemId)
            {
                this.Inventory.remove(myItem);
                return;
            }
        }
        throw new IllegalArgumentException("The item is not found in the inventory so cannot be removed.");
    }

    public void listItems()
    {
        for(int i = 0; i < Inventory.size(); i++)
        {
            Item item = Inventory.get(i);
            System.out.printf("Item-%d:\n", i + 1);
            System.out.printf("ID: %d\n", item.getId());
            System.out.printf("Name: %s\n", item.getName());
            System.out.printf("Price: %.2f\n", item.getPrice());
            System.out.printf("Quantity: %d\n", item.getQuantity());
        }
    }
}
