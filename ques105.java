import java.util.*;
public class ques105 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        int roll[] = new int[100];
        String name[] = new String[100];
        String branch[] = new String[100];
        double marks[] = new double[100];

        int count = 0;
        int choice;
        do {
            System.out.println("1.add Student");
            System.out.println("2.display Students");
            System.out.println("3.search Student");
            System.out.println("4.edit Student");
            System.out.println("5.delete Student");
            System.out.println("6.exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Roll Number");
                    roll[count] = sc.nextInt();

                    System.out.print("Enter Name");
                    name[count] = sc.nextLine();

                    System.out.print("Enter Branch");
                    branch[count] = sc.nextLine();

                    System.out.print("Enter Marks");
                    marks[count] = sc.nextDouble();

                    count++;
                    System.out.println("Student Added");
                    break;

                case 2:
                    System.out.println("Rollno.   Name   Branch   Marks");
                    for (int i = 0; i < count; i++) {
                        System.out.println(roll[i]+"   "+name[i]+"   "+branch[i]+"   "+marks[i]);
                    }
                    break;

                case 3:
                    System.out.print("Enter Roll Number to search");
                    int sroll = sc.nextInt();
                    boolean found=false;
                    for (int i=0; i<count; i++) {
                        if (roll[i] == sroll) {
                            System.out.println("Student Found");
                            System.out.println("Rollno-" + roll[i]);
                            System.out.println("Name-" + name[i]);
                            System.out.println("Branch-" + branch[i]);
                            System.out.println("Marks-" + marks[i]);
                            found = true;
                            break;
                        }
                    }

                    if (found==false)
                        System.out.println("Student Not Found");
                    break;

                case 4:
                    System.out.print("Enter Roll Number to edit");
                    int eroll = sc.nextInt();
                    found = false;
                    for (int i = 0; i < count; i++) {
                        if (roll[i] == eroll) {

                            System.out.print("Enter New Name: ");
                            name[i] = sc.nextLine();

                            System.out.print("Enter New Branch: ");
                            branch[i] = sc.nextLine();

                            System.out.print("Enter New Marks: ");
                            marks[i] = sc.nextDouble();
                            found = true;
                            System.out.println("Record Updated");
                            break;
                        }
                    }

                    if (found==false)
                        System.out.println("Student Not Found");
                    break;

                case 5:
                    System.out.print("Enter Roll Number to be removed");
                    int droll = sc.nextInt();
                    found = false;
                    for (int i = 0; i<count; i++) {
                        if (roll[i] == droll) {

                            for (int j=i; j<count-1; j++) {
                                roll[j] = roll[j+1];
                                name[j] = name[j+1];
                                branch[j] = branch[j+1];
                                marks[j] = marks[j+1];
                            }

                            count--;
                            found = true;
                            System.out.println("Student Removed");
                            break;
                        }
                    }

                    if (found==false)
                        System.out.println("Student Not Found");
                    break;

                case 6:
                    System.out.println("Program Ended");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 6);
    }
}
