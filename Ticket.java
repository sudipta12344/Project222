package Project222;

import java.util.Scanner;

public class Ticket extends Test {
    Scanner input = new Scanner(System.in);

    public Ticket() {
        System.out.print("Enter Passport No of Passenger: ");
        this.setSNo(input.nextInt());
        input.nextLine();

        System.out.print("Enter Passenger Name: ");
        this.setPassengerName(input.nextLine());

        System.out.print("Enter Destination: ");
        this.setDestination(input.nextLine());

        System.out.print("Enter phone number: ");
        this.setPhone(input.nextInt());
    }
}
