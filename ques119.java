import java.util.*;

public class ques119 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int id[] = new int[10];
        String name[] = new String[10];
        String department[] = new String[10];
        double salary[] = new double[10];

        int count = 0;
        int choice;

        do {

            System.out.println("===== MINI EMPLOYEE MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Display Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");
            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    if (count < 10) {

                        System.out.print("Enter Employee ID ");
                        id[count] = sc.nextInt();

                        sc.nextLine();

                        System.out.print("Enter Employee Name ");
                        name[count] = sc.nextLine();

                        System.out.print("Enter Department ");
                        department[count] = sc.nextLine();

                        System.out.print("Enter Salary ");
                        salary[count] = sc.nextDouble();

                        count++;

                        System.out.println("Employee Added Successfully");

                    } else {

                        System.out.println("Employee List Full");

                    }

                    break;

                case 2:

                    if (count == 0) {

                        System.out.println("No Employee Records Found");

                    } else {

                        System.out.println("ID\tName\tDepartment\tSalary");

                        for (int i = 0; i < count; i++) {

                            if (name[i] != null) {

                                System.out.println(id[i] + "\t"
                                        + name[i] + "\t"
                                        + department[i] + "\t        "
                                        + salary[i]);

                            }

                        }

                    }

                    break;

                case 3:

                    System.out.print("Enter Employee ID to Search");
                    int search = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {

                        if (id[i] == search && name[i] != null) {

                            System.out.println("Employee ID " + id[i]);
                            System.out.println("Name " + name[i]);
                            System.out.println("Department " + department[i]);
                            System.out.println("Salary " + salary[i]);

                            found = true;
                            break;

                        }

                    }

                    if (found==false) {

                        System.out.println("Employee Not Found");

                    }

                    break;

                case 4:

                    System.out.print("Enter Employee ID to Delete ");
                    int del = sc.nextInt();

                    found = false;

                    for (int i = 0; i < count; i++) {

                        if (id[i] == del && name[i] != null) {

                            id[i] = 0;
                            name[i] = null;
                            department[i] = null;
                            salary[i] = 0;

                            System.out.println("Employee Deleted Successfully");

                            found = true;
                            break;

                        }

                    }

                    if (found==false) {

                        System.out.println("Employee Not Found");

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