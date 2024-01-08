package Project222;

import java.util.Scanner;

public class Passengers {
    Scanner input = new Scanner(System.in);
    private Passenger[] thePassengers = new Passenger[50];
    public static int count = 0;

    public void addPassenger(Passenger passenger) {
        for (int i = 0; i < count; i++) {
            if (passenger.getPassNum().equalsIgnoreCase(thePassengers[i].getPassNum())) {
                System.out.println("\n\n\n\n Sorry !! Passenger with Passport Num " +
                        passenger.getPassNum() + " is Already Registered.");
                return;
            }
        }

        if (count < 50) {
            thePassengers[count] = passenger;
            count++;
        }
    }

    public void showAllPassengers() {
        System.out.println("\n\nPassenger Name\t\tPassport Number");
        for (int i = 0; i < count; i++) {
            System.out.println(thePassengers[i].getPassengerName() + "\t\t" +
                    thePassengers[i].getPassNum());
        }
    }
}
