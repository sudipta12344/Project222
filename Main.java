package Project222;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\t\t**************************************************");
        System.out.println("\t\t\t\tWelcome to Puja's Airline Ticket Reservation System");
        System.out.println("\t\t**************************************************\n");

        System.out.println("\n\n\t\t\t\t\t The task that you want to perform \n\n");

        Tickets ticketManager = new Tickets();
        Passengers passengerManager = new Passengers();

        int choice;
        int searchChoice;

        do {
            ticketManager.dispMenu();
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    Ticket newTicket = new Ticket();
                    ticketManager.addTicket(newTicket);
                    break;
                case 2:
                    ticketManager.upgradePassportNum();
                    break;
                case 3:
                    System.out.println(" Press 1 to Search with Passport No.");
                    System.out.println(" Press 2 to Search with Passenger's Destination.");
                    System.out.print("\n\n Enter your choice: ");

                    searchChoice = input.nextInt();

                    switch (searchChoice) {
                        case 1:
                            ticketManager.searchByPassNo();
                            break;
                        case 2:
                            ticketManager.searchByDestinationName();
                            break;
                    }
                    break;
                case 4:
                    ticketManager.showAllTickets();
                    break;
                default:
                    System.out.println("\n\n\n\t\t\t\t\t Thank you for choosing us\n\n\n");
            }
        } while (choice != 0);
    }
}
