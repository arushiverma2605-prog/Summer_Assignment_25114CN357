import java.util.*;
public class ques5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num");
        int t=sc.nextInt();
        int sum=0;int d; int n=t;
        while(n>0)
        {
            d=n%10;
            sum=sum+d;
            n=n/10;
        }
        System.out.println("sum of digits of"+t+"="+sum);
    }
}
