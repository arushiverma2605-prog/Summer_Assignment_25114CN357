import java.util.*;
public class ques115 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        String str;
        int choice;

        do {

            System.out.println("===== STRING OPERATIONS SYSTEM =====");
            System.out.println("1 Find Length");
            System.out.println("2 Convert to Uppercase");
            System.out.println("3 Convert to Lowercase");
            System.out.println("4 Reverse String");
            System.out.println("5 Compare Strings");
            System.out.println("6 Exit");
            System.out.print("Enter your choice");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice)
             {
                case 1:

                    System.out.print("Enter String");
                    str = sc.nextLine();

                    System.out.println("Length = " + str.length());

                    break;

                case 2:

                    System.out.print("Enter String");
                    str = sc.nextLine();

                    System.out.println("Uppercase = " + str.toUpperCase());

                    break;

                case 3:

                    System.out.print("Enter String");
                    str = sc.nextLine();

                    System.out.println("Lowercase = " + str.toLowerCase());

                    break;

                case 4:

                    System.out.print("Enter String");
                    str = sc.nextLine();

                    System.out.print("Reverse = ");

                    for (int i = str.length() - 1; i >= 0; i--) {

                        System.out.print(str.charAt(i));
                    }
                    break;

                case 5:

                    System.out.print("Enter First String");
                    String s1 = sc.nextLine();

                    System.out.print("Enter Second String");
                    String s2 = sc.nextLine();

                    if (s1.equals(s2)) {

                        System.out.println("Strings are Equal");

                    } else {

                        System.out.println("Strings are Not Equal");

                    }

                    break;

                case 6:

                    System.out.println("Thank You");
                    break;

                default:

                    System.out.println("Invalid Choice");
            }

        } while (choice != 6);

    }
}