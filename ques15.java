import java.util.*;
public class ques15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num");
        int t=sc.nextInt();
        int d; int n=t; int sum=0;
        while(n>0)
        {
           d=n%10;
           sum=sum+d*d*d;
           n=n/10;
        }
        if(t==sum)
        System.out.println("its armstrong num");
    else
        System.out.println("its not");
    }
}
