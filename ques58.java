import java.util.*;
public class ques58 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length");
        int l=sc.nextInt();
        int a[]=new int[l];
        System.out.println("enter array elements");
        for(int i=0;i<l;i++)
        {
            a[i]=sc.nextInt();
        }
        int temp=a[0];
        for(int i=0;i<l-1;i++)
        {
            a[i]=a[i+1];
        }
         a[l-1]=temp;
        for(int i=0;i<l;i++)
        {
            System.out.print(a[i]+",");
        }
    }
}
