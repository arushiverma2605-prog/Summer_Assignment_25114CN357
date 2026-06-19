import java.util.*;
public class ques63{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length");
        int l=sc.nextInt();
        int a[]=new int[l];
        System.out.println("enter array");
        for(int i=0;i<l;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("enter target sum");
        int ts=sc.nextInt();   int pts=0;  boolean found=false;
        for(int i=0;i<l-1;i++)
        {
            for(int j=i+1;j<l;j++)
            {
                   pts=a[i]+a[j];
                   if(ts==pts)
                    {
                        System.out.println("perfect match "+a[i]+","+a[j]);
                        found=true;
                        break;
                    }
            }
            if(found==true)
                break;

        }
        if(found==false)
            System.out.println("no pair found");
       
    }
}