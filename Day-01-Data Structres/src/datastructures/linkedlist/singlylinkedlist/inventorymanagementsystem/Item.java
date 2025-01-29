package datastructures.linkedlist.singlylinkedlist.inventorymanagementsystem;

class Item {
    String name;
    int id;
    int quantity;
    double price;
    Item next;

    public Item(int id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}
