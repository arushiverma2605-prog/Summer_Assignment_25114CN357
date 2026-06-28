import java.util.*;

public class ques111 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean booked[] = new boolean[10];

        int choice;

        do {

            System.out.println("===== TICKET BOOKING SYSTEM =====");
            System.out.println("1 Show Seats");
            System.out.println("2 Book Seat");
            System.out.println("3 Cancel Ticket");
            System.out.println("4 Exit");
            System.out.print("Enter your choice");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.println("Seat Status");

                    for (int i=0;i<10;i++) {

                        if (booked[i]==false) {
                            System.out.println("Seat "+ (i + 1) +" Available");
                        } else {
                            System.out.println("Seat "+ (i + 1) +" Booked");
                        }

                    }
                    break;

                case 2:

                    System.out.print("Enter Seat Number (1-10)");
                    int seat = sc.nextInt();

                    if (seat >= 1 && seat <= 10) {

                        if (booked[seat - 1] == false) {

                            booked[seat - 1] = true;
                            System.out.println("Seat Booked Successfully.");

                        } else {

                            System.out.println("Seat Already Booked.");

                        }

                    } else {

                        System.out.println("Invalid Seat Number.");

                    }

                    break;

                case 3:

                    System.out.print("Enter Seat Number to Cancel: ");
                    seat = sc.nextInt();

                    if (seat >= 1 && seat <= 10) {

                        if (booked[seat - 1] == true) {

                            booked[seat - 1] = false;
                            System.out.println("Ticket Cancelled Successfully.");

                        } else {

                            System.out.println("Seat is Already Available.");

                        }

                    } else {

                        System.out.println("Invalid Seat Number.");

                    }

                    break;

                case 4:

                    System.out.println("Thank You!");
                    break;

                default:

                    System.out.println("Invalid Choice.");
            }

        } while (choice != 4);

    }
}