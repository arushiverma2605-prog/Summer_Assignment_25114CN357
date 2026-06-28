import java.util.*;
public class ques113 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        double a, b;
        do {

            System.out.println("===== MENU DRIVEN CALCULATOR =====");
            System.out.println("1 Addition");
            System.out.println("2 Subtraction");
            System.out.println("3 Multiplication");
            System.out.println("4 Division");
            System.out.println("5 Modulus");
            System.out.println("6 Exit");

            System.out.print("Enter your choice");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter First Number");
                    a = sc.nextDouble();

                    System.out.print("Enter Second Number");
                    b = sc.nextDouble();

                    System.out.println("Sum = " + (a + b));
                    break;

                case 2:

                    System.out.print("Enter First Number");
                    a = sc.nextDouble();

                    System.out.print("Enter Second Number");
                    b = sc.nextDouble();

                    System.out.println("Difference = "+(a - b));
                    break;

                case 3:

                    System.out.print("Enter First Number");
                    a = sc.nextDouble();

                    System.out.print("Enter Second Number");
                    b = sc.nextDouble();

                    System.out.println("Product = " + (a * b));
                    break;

                case 4:

                    System.out.print("Enter First Number");
                    a = sc.nextDouble();

                    System.out.print("Enter Second Number");
                    b = sc.nextDouble();

                    if (b != 0) {
                        System.out.println("Quotient=" + (a / b));
                    } else {
                        System.out.println("Division by Zero is Not Possible");
                    }

                    break;

                case 5:

                    System.out.println("Thank You");
                    break;

                default:

                    System.out.println("Invalid Choice");
            }

        } while (choice != 5);

    }
}