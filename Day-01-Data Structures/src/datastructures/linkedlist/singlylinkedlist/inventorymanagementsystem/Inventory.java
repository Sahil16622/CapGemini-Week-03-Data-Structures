package datastructures.linkedlist.singlylinkedlist.inventorymanagementsystem;

class Inventory {
    private Item head;

    // Add item at the beginning
    public void addAtBeginning(int id, String name, int quantity, double price) {
        Item newItem = new Item(id, name, quantity, price);
        newItem.next = head;
        head = newItem;
    }

    // Add item at the end
    public void addAtEnd(int id, String name, int quantity, double price) {
        Item newItem = new Item(id, name, quantity, price);
        if (head == null) {
            head = newItem;
            return;
        }
        Item temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newItem;
    }

    // Add item at a specific position
    public void addAtPosition(int id, String name, int quantity, double price, int position) {
        if (position <= 1) {
            addAtBeginning(id, name, quantity, price);
            return;
        }

        Item newItem = new Item(id, name, quantity, price);
        Item temp = head;
        for (int i = 1; temp != null && i < position - 1; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of range.");
            return;
        }

        newItem.next = temp.next;
        temp.next = newItem;
    }

    // Remove item by Item ID
    public void removeItem(int id) {
        if (head == null) {
            System.out.println("Inventory is empty.");
            return;
        }

        if (head.id == id) {
            head = head.next;
            return;
        }

        Item temp = head;
        while (temp.next != null && temp.next.id != id) {
            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Item not found.");
            return;
        }

        temp.next = temp.next.next;
    }

    // Update item quantity by Item ID
    public void updateQuantity(int id, int newQuantity) {
        Item item = searchById(id);
        if (item != null) {
            item.quantity = newQuantity;
        } else {
            System.out.println("Item not found.");
        }
    }

    // Search for an item by ID
    public Item searchById(int id) {
        Item temp = head;
        while (temp != null) {
            if (temp.id == id) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    // Search for an item by Name
    public Item searchByName(String name) {
        Item temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    // Calculate total inventory value
    public double calculateTotalValue() {
        double totalValue = 0;
        Item temp = head;
        while (temp != null) {
            totalValue += temp.price * temp.quantity;
            temp = temp.next;
        }
        return totalValue;
    }

    // Display inventory
    public void displayInventory() {
        if (head == null) {
            System.out.println("Inventory is empty.");
            return;
        }
        Item temp = head;
        while (temp != null) {
            System.out.println("ID: " + temp.id + ", Name: " + temp.name + ", Quantity: " + temp.quantity + ", Price: $" + temp.price);
            temp = temp.next;
        }
    }

    // Sort inventory by Item Name (Bubble Sort)
    public void sortByName() {
        if (head == null || head.next == null) return;

        boolean swapped;
        do {
            swapped = false;
            Item current = head;
            Item prev = null;
            while (current != null && current.next != null) {
                if (current.name.compareToIgnoreCase(current.next.name) > 0) {
                    Item temp = current.next;
                    current.next = temp.next;
                    temp.next = current;
                    if (prev == null) {
                        head = temp;
                    } else {
                        prev.next = temp;
                    }
                    swapped = true;
                }
                prev = current;
                current = current.next;
            }
        } while (swapped);
    }

    // Sort inventory by Price (Bubble Sort)
    public void sortByPrice() {
        if (head == null || head.next == null) return;

        boolean swapped;
        do {
            swapped = false;
            Item current = head;
            Item prev = null;
            while (current != null && current.next != null) {
                if (current.price > current.next.price) {
                    Item temp = current.next;
                    current.next = temp.next;
                    temp.next = current;
                    if (prev == null) {
                        head = temp;
                    } else {
                        prev.next = temp;
                    }
                    swapped = true;
                }
                prev = current;
                current = current.next;
            }
        } while (swapped);
    }
}


