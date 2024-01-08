package Project222;

import java.util.Scanner;

public class Tickets {
    private Ticket[] theTickets = new Ticket[50];
    private static int count;
    private Scanner input = new Scanner(System.in);

    public int compareTicketObjects(Ticket ticket1, Ticket ticket2) {
        if (ticket1.getPassengerName().equalsIgnoreCase(ticket2.getPassengerName())) {
            System.out.println("\n\n\t\tTicket of this Name is Already Exists.");
            return 0;
        }
        if (ticket1.getSNo() == ticket2.getSNo()) {
            System.out.println("\n\n\t\tTicket of this Passport No Already Exists.");
            return 0;
        }
        return 1;
    }

    public void addTicket(Ticket ticket) {
        for (int i = 0; i < count; i++) {
            if (this.compareTicketObjects(ticket, this.theTickets[i]) == 0) {
                return;
            }
        }

        if (count < 50) {
            theTickets[count] = ticket;
            count++;
        } else {
            System.out.println("No Space to Add More Tickets.");
        }
    }

    public void searchByPassNo() {
        System.out.println("\n\n\t\t\t\tSEARCH BY PASSPORT NUMBER\n");
        int sNo;
        System.out.print("\n\nEnter Passport No of passenger: ");
        sNo = input.nextInt();
        int flag = 0;
        System.out.println("Passport No\t\tPassenger Name\t\tDestination\t\tPhone");

        for (int i = 0; i < count; i++) {
            if (sNo == theTickets[i].getSNo()) {
                System.out.println(theTickets[i].getSNo() + "\t\t\t" +
                        theTickets[i].getPassengerName() + "\t\t\t" + theTickets[i].getDestination() + "\t\t\t " +
                        theTickets[i].getPhone());

                flag++;
                return;
            }
        }
        if (flag == 0)
            System.out.println("\n\n\t\tNo Ticket for Passport No " + sNo + " Found.");
    }

    public void searchByDestinationName() {
        System.out.println("\n\n\t\t\t\tSEARCH BY DESTINATION NAME");
        System.out.print("Enter Destination Name: ");

        input.nextLine();

        String destination = input.nextLine();
        int flag = 0;
        System.out.println("Passport No\t\tPassenger Name\t\tDestination\t\tPhone");

        for (int i = 0; i < count; i++) {
            if (destination.equalsIgnoreCase(theTickets[i].getDestination())) {
                System.out.println(theTickets[i].getSNo() + "\t\t\t" +
                        theTickets[i].getPassengerName() + "\t\t\t" + theTickets[i].getDestination() + "\t\t\t " +
                        theTickets[i].getPhone());

                flag++;
            }
        }
        if (flag == 0)
            System.out.println("\n\n\t\tNo Tickets of " + destination + " Found.");
    }

    public void showAllTickets() {
        System.out.println("\n\t\t\t\tSHOWING ALL Tickets\n");
        System.out.println("Passport No.\t\tPassenger Name\t\tDestination\t\tPhone");

        for (int i = 0; i < count; i++) {
            System.out.println(theTickets[i].getSNo() + "\t\t\t" +
                    theTickets[i].getPassengerName() + "\t\t\t" + theTickets[i].getDestination() + "\t\t\t " +
                    theTickets[i].getPhone());
        }
    }

    public void upgradePassportNum() {
        System.out.println("\n\n\t\t\t\tUPGRADE PASSPORT NO OF TICKET\n");
        System.out.print("Enter Passport No of Passenger: ");
        int sNo = input.nextInt();
        for (int i = 0; i < count; i++) {
            if (sNo == theTickets[i].getSNo()) {
                System.out.print("Enter Passport No to be Upgraded: ");
                int upPass = input.nextInt();
                theTickets[i].setSNo(upPass);
                return;
            }
        }
    }

    public void dispMenu() {
        System.out.println("\t\t\t\t _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ ");
        System.out.println("\t\t\t\t|| ||");
        System.out.println("\t\t\t\t|| Press 1 to Ticket Booking. ` ||");
        System.out.println("\t\t\t\t|| Press 2 to Upgrade. ||");
        System.out.println("\t\t\t\t|| Press 3 to Search Ticket Details. ||");
        System.out.println("\t\t\t\t|| Press 4 to Display All Tickets. ||");
        System.out.println("\t\t\t\t|| Press 0 to Exit. ||");
        System.out.println("\t\t\t\t||_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _||");
        System.out.print("\n\n\t\t\t\t\t\tEnter your choice: ");
    }
}
