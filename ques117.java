import java.util.*;

public class ques117 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int roll[] = new int[10];
        String name[] = new String[10];
        String course[] = new String[10];
        int marks[] = new int[10];

        int count = 0;
        int choice;

        do {

            System.out.println("===== STUDENT RECORD SYSTEM =====");
            System.out.println("1 Add Student");
            System.out.println("2 Display Students");
            System.out.println("3 Search Student");
            System.out.println("4 Delete Student");
            System.out.println("5 Exit");
            System.out.print("Enter your choice");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    if (count < 10) {

                        System.out.print("Enter Roll Number");
                        roll[count] = sc.nextInt();

                        System.out.print("Enter Student Name");
                        name[count] = sc.nextLine();

                        System.out.print("Enter Course");
                        course[count] = sc.nextLine();

                        System.out.print("Enter Marks");
                        marks[count] = sc.nextInt();

                        count++;

                        System.out.println("Student Record Added Successfully");

                    } else {

                        System.out.println("Record List Full.");

                    }

                    break;

                case 2:

                    if (count == 0) {

                        System.out.println("No Student Records Found");

                    } else {

                        System.out.println("Roll\tName\tCourse\tMarks");

                        for (int i = 0; i < count; i++) {

                            if (name[i] != null) {

                                System.out.println(roll[i] + "\t"
                                        + name[i] + "\t"
                                        + course[i] + "\t"
                                        + marks[i]);

                            }

                        }

                    }

                    break;

                case 3:

                    System.out.print("Enter Roll Number to Search");
                    int search = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {

                        if (roll[i] == search && name[i] != null) {

                            System.out.println("Roll Number : " + roll[i]);
                            System.out.println("Name : " + name[i]);
                            System.out.println("Course : " + course[i]);
                            System.out.println("Marks : " + marks[i]);

                            found = true;
                            break;

                        }

                    }

                    if (found==false) {

                        System.out.println("Student Record Not Found");

                    }

                    break;

                case 4:

                    System.out.print("Enter Roll Number to Delete");
                    int del = sc.nextInt();

                    found = false;

                    for (int i = 0; i < count; i++) {

                        if (roll[i] == del && name[i] != null) {

                            roll[i] = 0;
                            name[i] = null;
                            course[i] = null;
                            marks[i] = 0;

                            System.out.println("Student Record Deleted Successfully");

                            found = true;
                            break;

                        }

                    }

                    if (!found) {

                        System.out.println("Student Record Not Found");

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