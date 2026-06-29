import java.util.*;

public class ques118 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int id[] = new int[10];
        String book[] = new String[10];
        String author[] = new String[10];
        String status[] = new String[10];

        int count = 0;
        int choice;

        do {

            System.out.println("===== MINI LIBRARY SYSTEM =====");
            System.out.println("1  Add Book");
            System.out.println("2  Display Books");
            System.out.println("3  Issue Book");
            System.out.println("4  Return Book");
            System.out.println("5  Exit");
            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    if (count < 10) {

                        System.out.print("Enter Book ID ");
                        id[count] = sc.nextInt();

                        sc.nextLine();

                        System.out.print("Enter Book Name ");
                        book[count] = sc.nextLine();

                        System.out.print("Enter Author Name ");
                        author[count] = sc.nextLine();

                        status[count] = "Available";

                        count++;

                        System.out.println("Book Added Successfully");

                    } else {

                        System.out.println("Library is Full");

                    }

                    break;

                case 2:

                    if (count == 0) {

                        System.out.println("No Books Available");

                    } else {

                        System.out.println("ID\tBook\tAuthor\tStatus");

                        for (int i = 0; i < count; i++) {

                            if (book[i] != null) {

                                System.out.println(id[i] + "\t"
                                        + book[i] + "\t"
                                        + author[i] + "\t"
                                        + status[i]);

                            }

                        }

                    }

                    break;

                case 3:

                    System.out.print("Enter Book ID to Issue: ");
                    int issue = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {

                        if (id[i] == issue && book[i] != null) {

                            if (status[i].equals("Available")) {

                                status[i] = "Issued";
                                System.out.println("Book Issued Successfully");

                            } else {

                                System.out.println("Book Already Issued");

                            }

                            found = true;
                            break;

                        }

                    }

                    if (!found) {

                        System.out.println("Book Not Found");

                    }

                    break;

                case 4:

                    System.out.print("Enter Book ID to Return ");
                    int ret = sc.nextInt();

                    found = false;

                    for (int i = 0; i < count; i++) {

                        if (id[i] == ret && book[i] != null) {

                            if (status[i].equals("Issued")) {

                                status[i] = "Available";
                                System.out.println("Book Returned Successfully");

                            } else {

                                System.out.println("Book is Already Available");

                            }

                            found = true;
                            break;

                        }

                    }

                    if (!found) {

                        System.out.println("Book Not Found");

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