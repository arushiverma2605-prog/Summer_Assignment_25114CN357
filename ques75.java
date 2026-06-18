import java.util.*;
public class ques75 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array elements");
        int a[][]=new int[3][3];
        for(int r=0;r<3;r++)
        {
            for(int c=0;c<3;c++)
            {
                a[r][c]=sc.nextInt();
            }
        }
        System.out.println("transpose of matrix");
        for(int r=0;r<3;r++)
        {
            for(int c=0;c<3;c++)
            {
                System.out.print(a[c][r]+" ");
            }
            System.out.println();
        }
    }
}
