import java.util.*;
public class ques57 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length");
        int l=sc.nextInt();
        int a[]=new int[l];
        System.out.println("enter elements");
        for(int i=0;i<l;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<l;i++)
        {
            System.out.println(a[i]+",");
        }

        System.out.println("reverse of matrix");
        for(int i=l-1;i>=0;i--)
        {
            System.out.print(a[i]+",");
        }
    }
}
