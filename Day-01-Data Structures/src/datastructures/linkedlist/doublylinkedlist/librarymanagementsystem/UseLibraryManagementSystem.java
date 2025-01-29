package datastructures.linkedlist.doublylinkedlist.librarymanagementsystem;

public class UseLibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();

        library.addAtEnd(101, "The Great Gatsby", "F. Scott Fitzgerald", "Fiction", true);
        library.addAtBeginning(102, "To Kill a Mockingbird", "Harper Lee", "Classic", true);
        library.addAtEnd(103, "1984", "George Orwell", "Dystopian", false);
        library.addAtPosition(104, "Moby Dick", "Herman Melville", "Adventure", true, 2);

        System.out.println("Library Books (Forward Order):");
        library.displayForward();

        System.out.println("\nUpdating Availability of '1984' to Available:");
        library.updateAvailability(103, true);
        library.displayForward();

        System.out.println("\nSearching for books by Harper Lee:");
        library.searchByAuthor("Harper Lee");

        System.out.println("\nSearching for 'The Great Gatsby':");
        library.searchByTitle("The Great Gatsby");

        System.out.println("\nTotal Books in Library: " + library.countBooks());

        System.out.println("\nRemoving 'Moby Dick':");
        library.removeByBookId(104);
        library.displayForward();

        System.out.println("\nLibrary Books (Reverse Order):");
        library.displayReverse();
    }
}

