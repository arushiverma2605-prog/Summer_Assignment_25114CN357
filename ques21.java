import java.util.*;
public class ques21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a num");
        int t=sc.nextInt();
        int n=t; int d; String b=" ";
        while(n>0)
        {
            d=n%2;
            b=d+b;
            n=n/2;
        }
        System.out.println("binary "+b);
    }
}
