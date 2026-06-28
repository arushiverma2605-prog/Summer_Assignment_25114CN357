import java.util.*;

public class ques110 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int accNo[] = new int[10];
        String name[] = new String[10];
        double balance[] = new double[10];

        int count = 0;
        int choice;

        do {
            System.out.println("===== BANK ACCOUNT SYSTEM =====");
            System.out.println("1 Create Account");
            System.out.println("2 Deposit Money");
            System.out.println("3 Withdraw Money");
            System.out.println("4 Check Balance");
            System.out.println("5 Display All Accounts");
            System.out.println("6 Exit");
            System.out.print("Enter your choice");
            choice = sc.nextInt();

            switch (choice) 
            {
                case 1:
                    if (count < 10)
                         {
                        System.out.print("Enter Account Number");
                        accNo[count] = sc.nextInt();

                        System.out.print("Enter Customer Name");
                        name[count] = sc.nextLine();

                        System.out.print("Enter Opening Balance");
                        balance[count] = sc.nextDouble();

                        count++;

                        System.out.println("Account Created Successfully.");

                    } else {
                        System.out.println("Bank Storage Full.");
                    }
                    break;

                case 2:

                    System.out.print("Enter Account Number: ");
                    int depAcc = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {

                        if (accNo[i] == depAcc) {

                            System.out.print("Enter Deposit Amount");
                            double amount = sc.nextDouble();

                            balance[i] = balance[i]+amount;

                            System.out.println("Deposit Successful");
                            System.out.println("New Balance=" + balance[i]);

                            found = true;
                            break;
                        }
                    }

                    if (found==false) {
                        System.out.println("Account Not Found.");
                    }

                    break;

                case 3:

                    System.out.print("Enter Account Number: ");
                    int wAcc = sc.nextInt();

                    found = false;

                    for (int i = 0; i < count; i++) {

                        if (accNo[i] == wAcc) {

                            System.out.print("Enter Withdraw Amount: ");
                            double amount = sc.nextDouble();

                            if (balance[i] >= amount) {

                                balance[i] = balance[i] - amount;

                                System.out.println("Withdrawal Successful.");
                                System.out.println("Remaining Balance = " + balance[i]);

                            } else
                                 {
                                System.out.println("Insufficient Balance.");
                            }
                            found = true;
                            break;
                        }
                    }
                    if (found==false)
                         {
                        System.out.println("Account Not Found.");
                    }
                    break;

                case 4:

                    System.out.print("Enter Account Number: ");
                    int check = sc.nextInt();

                    found = false;

                    for (int i = 0; i < count; i++) {

                        if (accNo[i] == check) {

                            System.out.println("Customer Name : " + name[i]);
                            System.out.println("Current Balance : " + balance[i]);

                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Account Not Found");
                    }
                    break;

                case 5:

                    if (count == 0) 
                        {
                        System.out.println("No Accounts Available.");

                    } 
                    else {

                        System.out.println("\nAcc No\tName\tBalance");

                        for (int i = 0; i < count; i++) {

                            System.out.println(accNo[i]+"\t"+name[i]+"\t"+balance[i]);

                        }

                    }
                    break;
                    
                case 6:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 6);

    }
}