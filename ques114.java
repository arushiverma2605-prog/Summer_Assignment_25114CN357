import java.util.*;

public class ques114 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[10];

        int choice;
        int sum, max, min, key;
        boolean found = false;
        do {
            System.out.println("\n===== ARRAY OPERATIONS SYSTEM =====");
            System.out.println("1. Input Array");
            System.out.println("2. Display Array");
            System.out.println("3. Find Sum");
            System.out.println("4. Find Maximum");
            System.out.println("5. Find Minimum");
            System.out.println("6. Search Element");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.println("Enter 10 Elements:");

                    for (int i = 0; i < 10; i++) {
                        arr[i] = sc.nextInt();
                    }
                    System.out.println("Array Stored");
                    break;

                case 2:

                    System.out.println("Array Elements");

                    for (int i = 0; i < 10; i++) {
                        System.out.print(arr[i] + " ");
                    }

                    System.out.println();
                    break;

                case 3:

                    sum = 0;
                    for (int i = 0; i < 10; i++) {
                        sum = sum + arr[i];
                    }

                    System.out.println("Sum = " + sum);
                    break;

                case 4:

                    max = arr[0];

                    for (int i = 1; i < 10; i++) {

                        if (arr[i] > max) {
                            max = arr[i];
                        }

                    }
                    System.out.println("Maximum = " + max);
                    break;

                case 5:

                    min = arr[0];

                    for (int i = 1; i < 10; i++) {

                        if (arr[i] < min) {
                            min = arr[i];
                        }

                    }

                    System.out.println("Minimum = " + min);
                    break;

                case 6:

                    System.out.print("Enter Element to Search");
                    key = sc.nextInt();
                    found = false;

                    for (int i = 0; i < 10; i++) {

                        if (arr[i] == key) 
                            {
                            System.out.println("Element Found at Index " + i);
                            found = true;
                            break;
                        }
                    }

                    if (found==false) {
                        System.out.println("Element Not Found.");
                    }

                    break;

                case 7:

                    System.out.println("Thank You");
                    break;

                default:

                    System.out.println("Invalid Choice");
            }

        } while (choice != 7);

    }
}