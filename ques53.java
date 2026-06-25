import java.util.*;
public class ques53 {
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
        int place=0; int flag=0;
        System.out.println("enter element to be searched");
        int s=sc.nextInt();
        for(int i=0;i<l;i++)
        {
           if(a[i]==s)
           {
            place=i;
            flag++;
            break;
           }
        }
        if(flag!=0)
            System.out.println("element "+s+" found at "+(place+1)+"th position");
        else
            System.out.println("element not found");
    }
}
