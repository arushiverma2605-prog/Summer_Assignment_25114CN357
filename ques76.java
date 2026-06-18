import java.util.*;
public class ques76 {
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
        System.out.println(" matrix is ");
        for(int r=0;r<3;r++)
        {
            for(int c=0;c<3;c++)
            {
                System.out.print(a[r][c]+" ");
            }
            System.out.println();
        }
        int lds=0; int rds=0;
        for(int r=0;r<3;r++)
        {
            for(int c=0;c<3;c++)
            {
                if(c==r)
                lds=lds+a[r][c];
                if(r+c==2)
                    rds=rds+a[r][c];
            }
        }
        System.out.println("sum of left diagonal = "+lds);
        System.out.println("sum of right diagonal = "+rds);
    }
}
