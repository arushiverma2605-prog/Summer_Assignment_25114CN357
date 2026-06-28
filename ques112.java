import java.util.*;
public class ques112 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name[] = new String[10];
        String phone[] = new String[10];

        int count = 0;
        int choice;

        do {

            System.out.println("===== CONTACT MANAGEMENT SYSTEM =====");
            System.out.println("1 Add Contact");
            System.out.println("2 Display Contacts");
            System.out.println("3 Search Contact");
            System.out.println("4 Delete Contact");
            System.out.println("5 Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    if (count < 10) {

                        System.out.print("Enter Name");
                        name[count] = sc.nextLine();

                        System.out.print("Enter Phone Number");
                        phone[count] = sc.nextLine();

                        count++;

                        System.out.println("Contact Added Successfully");

                    } else {

                        System.out.println("Contact List Full");

                    }

                    break;

                case 2:

                    if (count == 0) {

                        System.out.println("No Contacts Available.");

                    } else {

                        System.out.println("Name\tPhone Number");

                        for (int i = 0; i < count; i++) {

                            if (name[i] != null) {
                                System.out.println(name[i]+"\t"+phone[i]);
                            }
                        }
                    }
                    break;

                case 3:

                    System.out.print("Enter Name to Search: ");
                    String search = sc.nextLine();

                    boolean found = false;

                    for (int i=0;i<count;i++) {

                        if (name[i] != null && name[i].equalsIgnoreCase(search)) {

                            System.out.println("Name " + name[i]);
                            System.out.println("Phone " + phone[i]); 
                            found = true;
                            break;
                        }

                    }

                    if (found==false) {
                        System.out.println("Contact Not Found.");
                    }

                    break;

                case 4:

                    System.out.print("Enter Name to Delete");
                    String del = sc.nextLine();

                    found = false;

                    for (int i = 0; i < count; i++) {

                        if (name[i] != null && name[i].equalsIgnoreCase(del)) {

                            name[i] = null;
                            phone[i] = null;

                            found = true;

                            System.out.println("Contact Deleted Successfully.");
                            break;
                        }

                    }
                    if (found==false) {
                        System.out.println("Contact Not Found.");
                    }
                    break;

                case 5:

                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            }

        } while (choice != 5);

    }
}