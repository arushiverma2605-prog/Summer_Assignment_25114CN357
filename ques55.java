import java.util.*;
public class ques55 {
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
        int max=a[0]; int secl=a[0];
        for(int i=0;i<l;i++)
        {
            if(max<a[i])
                max=a[i];
        }
        for(int i=0;i<l;i++)
        {
            if(a[i]>secl && a[i]<max)
                secl=a[i];
        }
        System.out.println("second largest element="+secl);
    }
}
