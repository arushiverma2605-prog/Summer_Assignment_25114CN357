import java.util.*;
public class ques49 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length");
        int l=sc.nextInt();
        System.out.println("enter array");
        int a[]=new int[l];
        for(int i=0;i<l;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.print("elements are ");
        for(int i=0;i<l;i++)
        {
            System.out.print(a[i]+",");
        }
    }
}
