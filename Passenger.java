package Project222;

import java.util.Scanner;

public class Passenger {

    private String passengerName;
    private String passNum;
    private Ticket[] borrowedTickets = new Ticket[3];
    public int ticketCount = 0;

    Scanner input = new Scanner(System.in);

    public Passenger() {
        System.out.print("Enter Passenger Name: ");
        this.passengerName = input.nextLine();
        System.out.print("Enter Passport Number: ");
        this.passNum = input.nextLine();
    }

    // Adding getPassNum method
    public String getPassNum() {
        return passNum;
    }

    // Adding getter for passengerName
    public String getPassengerName() {
        return passengerName;
    }
}
