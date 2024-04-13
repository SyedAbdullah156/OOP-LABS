package Lab_7.Task_1;

import java.util.Scanner;

public class TestClass 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        InventoryManager inventory = new InventoryManager();

        System.out.println("===== Inventory Management Menu =====");
        displayMenu();
        int choice = input.nextInt();
        do
        {
            switch(choice)
            {
                case 1:
                {
                    inventory.addItem();
                    break;
                }
                case 2:
                {
                    System.out.print("Enter the Item id for updation: ");
                    int updateId = input.nextInt();
                    inventory.UpdateItem(updateId);
                    break;
                }
                case 3:
                {
                    System.out.print("Enter the Item id for removal: ");
                    int removeId = input.nextInt();
                    inventory.removeItem(removeId);
                    break;
                }
                case 4:
                {
                    inventory.listItems();
                    break;
                }
                default:
                {
                    break;
                }
            }
            displayMenu();
            choice = input.nextInt();
        }while(choice != 5);
    }

    private static void displayMenu() 
    {
        System.out.println("1. Add Item");
        System.out.println("2. Update Item");
        System.out.println("3. Remove Item");
        System.out.println("4. List Items");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }
}
