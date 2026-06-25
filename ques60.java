import java.util.*;
public class ques60 {
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
        for(int i=0;i<l;i++)
        {
            if(a[i]==0)
            {
                for(int j=i;j<l-1;j++)
                {
                    a[j]=a[j+1];
                }
                a[l-1]=a[0];
                i--;
            }
        }
        for(int i=0;i<l;i++)
        {
            System.out.print(a[i]+",");
        }
    }
}
