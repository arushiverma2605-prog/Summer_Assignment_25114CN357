import java.util.*;
public class ques50 {
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
        int sum=0; double avg;
        for(int i=0;i<l;i++)
        {
            sum=sum+a[i];
        }
        avg=(double)sum/l;
        System.out.println("sum of array="+sum);
        System.out.println("average of array="+avg);
    }
}
