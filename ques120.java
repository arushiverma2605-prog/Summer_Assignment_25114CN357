import java.util.*;

public class ques120 {

    static Scanner sc = new Scanner(System.in);

    static int roll[] = new int[10];
    static String name[] = new String[10];
    static int marks[] = new int[10];

    static int count = 0;

    // Add Student
    static void addStudent() {

        if (count < 10) {

            System.out.print("Enter Roll Number ");
            roll[count] = sc.nextInt();

            sc.nextLine();

            System.out.print("Enter Name ");
            name[count] = sc.nextLine();

            System.out.print("Enter Marks ");
            marks[count] = sc.nextInt();

            count++;

            System.out.println("Student Added Successfully");

        } else {

            System.out.println("Record Full");

        }

    }

    // Display Students
    static void displayStudent() {

        if (count == 0) {

            System.out.println("No Records Found");

        } else {

            System.out.println("Roll\tName\tMarks");

            for (int i = 0; i < count; i++) {

                if (name[i] != null) {

                    System.out.println(roll[i] + "\t" + name[i] + "\t" + marks[i]);

                }

            }

        }

    }

    // Search Student
    static void searchStudent() {

        System.out.print("Enter Roll Number ");
        int search = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < count; i++) {

            if (roll[i] == search && name[i] != null) {

                System.out.println("Roll Number : " + roll[i]);
                System.out.println("Name : " + name[i]);
                System.out.println("Marks : " + marks[i]);

                found = true;
                break;

            }

        }

        if (found==false) {

            System.out.println("Student Not Found");

        }

    }

    // Delete Student
    static void deleteStudent() {

        System.out.print("Enter Roll Number ");
        int del = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < count; i++) {

            if (roll[i] == del && name[i] != null) {

                roll[i] = 0;
                name[i] = null;
                marks[i] = 0;

                System.out.println("Student Deleted Successfully");

                found = true;
                break;

            }

        }

        if (!found) {

            System.out.println("Student Not Found");

        }

    }

    public static void main(String[] args) {

        int choice;

        do {

            System.out.println("===== MINI PROJECT =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter Your Choice ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addStudent();
                    break;

                case 2:
                    displayStudent();
                    break;

                case 3:
                    searchStudent();
                    break;

                case 4:
                    deleteStudent();
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