import java.util.*;
public class ques65 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1st array");
        int a[]=new int[5];
        System.out.println("enter 2nd array");
        int b[]=new int[5];
        for(int i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++)
        {
            b[i]=sc.nextInt();
        }
        System.out.print("merged array = ");
        for(int i=0;i<5;i++)
        {
            System.out.print(a[i]+",");
        }
         for(int i=0;i<5;i++)
        {
            System.out.print(b[i]+",");
        }

    }
}
