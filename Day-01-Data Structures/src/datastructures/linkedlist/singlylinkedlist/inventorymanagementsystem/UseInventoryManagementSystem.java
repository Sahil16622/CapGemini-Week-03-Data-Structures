package datastructures.linkedlist.singlylinkedlist.inventorymanagementsystem;

public class UseInventoryManagementSystem {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        inventory.addAtEnd(101, "Laptop", 5, 800.50);
        inventory.addAtBeginning(102, "Mouse", 20, 15.99);
        inventory.addAtEnd(103, "Keyboard", 10, 25.50);
        inventory.addAtPosition(104, "Monitor", 8, 120.75, 2);

        System.out.println("Inventory Records:");
        inventory.displayInventory();

        System.out.println("\nUpdating quantity for Item ID 103:");
        inventory.updateQuantity(103, 15);
        inventory.displayInventory();

        System.out.println("\nSearching for Item ID 102:");
        Item found = inventory.searchById(102);
        if (found != null) {
            System.out.println("Found: " + found.name + ", Quantity: " + found.quantity + ", Price: $" + found.price);
        } else {
            System.out.println("Item not found.");
        }

        System.out.println("\nTotal Inventory Value: $" + inventory.calculateTotalValue());

        System.out.println("\nSorting inventory by Name:");
        inventory.sortByName();
        inventory.displayInventory();

        System.out.println("\nSorting inventory by Price:");
        inventory.sortByPrice();
        inventory.displayInventory();

        System.out.println("\nRemoving Item ID 101:");
        inventory.removeItem(101);
        inventory.displayInventory();
    }
}



