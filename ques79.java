import java.util.*;

public class ques79 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[][] = new int[3][3];

        System.out.println("Enter matrix");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            int sum = 0;

            for (int j = 0; j < 3; j++) {
                sum += a[i][j];
            }

            System.out.println("Sum of Row " + (i + 1) + " = " + sum);
        }
    }
}