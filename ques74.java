import java.util.*;
public class ques74 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[3][3];
        int b[][]=new int[3][3];
        int s[][]=new int[3][3];
        System.out.println("enter elements of first matrix");
        for(int r=0;r<3;r++)
        {
            for(int c=0;c<3;c++)
            {
                a[r][c]=sc.nextInt();
            }
        }
        System.out.println("enter elements of 2nd matrix");
        for(int r=0;r<3;r++)
        {
            for(int c=0;c<3;c++)
            {
                b[r][c]=sc.nextInt();
            }
        }
        for(int r=0;r<3;r++)
        {
            for(int c=0;c<3;c++)
            {
                s[r][c]=a[r][c]-b[r][c];
            }
        }
        System.out.println("substraction of matrix");
        for(int r=0;r<3;r++)
        {
            for(int c=0;c<3;c++)
            {
                System.out.print(s[r][c]+" ");
            }
            System.out.println();
        }
    }
}
