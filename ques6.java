import java.util.*;
public class ques6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a num");
        int t=sc.nextInt();
        int rev=0;
        int n=t;int d;
        while(n>0)
        {
            d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        System.out.println("reverse of num "+rev);
    }
}
