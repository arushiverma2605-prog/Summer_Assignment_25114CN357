import java.util.*;
public class ques54 {
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
        int flag=1;
        System.out.println("enter element to check freq");
        int s=sc.nextInt();
        for(int i=0;i<l;i++)
        {
            if(a[i]==s)
                flag++;
        }
        System.out.println("freq of element "+s+"="+flag);
    }
}
