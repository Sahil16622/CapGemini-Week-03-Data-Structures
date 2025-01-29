package datastructures.linkedlist.circularlinkedlist.onlineticketreservationsystem;

public class UseTicketReservationSystem {
    public static void main(String[] args) {
        TicketReservationSystem system = new TicketReservationSystem();

        system.bookTicket(101, "Alice", "Inception", 12, "18:00");
        system.bookTicket(102, "Bob", "Avatar", 8, "20:00");
        system.bookTicket(103, "Charlie", "Interstellar", 15, "19:30");

        system.displayTickets();

        System.out.println("\nSearching for tickets booked by 'Alice':");
        system.searchTicket("Alice");

        System.out.println("\nTotal booked tickets:");
        system.totalBookedTickets();

        System.out.println("\nCancelling Ticket ID 102:");
        system.cancelTicket(102);
        system.displayTickets();
    }
}

