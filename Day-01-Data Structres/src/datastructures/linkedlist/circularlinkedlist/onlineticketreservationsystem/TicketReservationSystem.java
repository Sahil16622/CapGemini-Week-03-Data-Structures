package datastructures.linkedlist.circularlinkedlist.onlineticketreservationsystem;

class TicketReservationSystem {
    private Ticket head = null;
    private Ticket tail = null;
    private int totalTickets = 0;

    // Add a new ticket at the end of the circular list
    public void bookTicket(int ticketId, String customerName, String movieName, int seatNumber, String bookingTime) {
        Ticket newTicket = new Ticket(ticketId, customerName, movieName, seatNumber, bookingTime);
        if (head == null) {
            head = tail = newTicket;
            tail.next = head; // Circular link
        } else {
            tail.next = newTicket;
            tail = newTicket;
            tail.next = head; // Maintain circular link
        }
        totalTickets++;
        System.out.println("Ticket booked successfully for " + customerName);
    }

    // Remove a ticket by Ticket ID
    public void cancelTicket(int ticketId) {
        if (head == null) {
            System.out.println("No tickets booked.");
            return;
        }

        Ticket temp = head, prev = null;

        // If the ticket to be removed is at the head
        if (head.ticketId == ticketId) {
            if (head == tail) { // Only one ticket
                head = tail = null;
            } else {
                head = head.next;
                tail.next = head;
            }
            totalTickets--;
            System.out.println("Ticket ID " + ticketId + " has been cancelled.");
            return;
        }

        // Search for the ticket
        do {
            prev = temp;
            temp = temp.next;
            if (temp.ticketId == ticketId) {
                prev.next = temp.next;
                if (temp == tail) {
                    tail = prev;
                }
                tail.next = head;
                totalTickets--;
                System.out.println("Ticket ID " + ticketId + " has been cancelled.");
                return;
            }
        } while (temp != head);

        System.out.println("Ticket ID " + ticketId + " not found.");
    }

    // Display all booked tickets
    public void displayTickets() {
        if (head == null) {
            System.out.println("No tickets booked.");
            return;
        }

        System.out.println("\nCurrent Booked Tickets:");
        Ticket temp = head;
        do {
            System.out.println("Ticket ID: " + temp.ticketId + ", Customer: " + temp.customerName +
                    ", Movie: " + temp.movieName + ", Seat: " + temp.seatNumber + ", Time: " + temp.bookingTime);
            temp = temp.next;
        } while (temp != head);
    }

    // Search for a ticket by Customer Name or Movie Name
    public void searchTicket(String query) {
        if (head == null) {
            System.out.println("No tickets booked.");
            return;
        }

        Ticket temp = head;
        boolean found = false;
        do {
            if (temp.customerName.equalsIgnoreCase(query) || temp.movieName.equalsIgnoreCase(query)) {
                System.out.println("Ticket Found: ID " + temp.ticketId + ", Customer: " + temp.customerName +
                        ", Movie: " + temp.movieName + ", Seat: " + temp.seatNumber + ", Time: " + temp.bookingTime);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("No ticket found for: " + query);
        }
    }

    // Get the total number of booked tickets
    public void totalBookedTickets() {
        System.out.println("Total Tickets Booked: " + totalTickets);
    }
}


