import java.util.*;
public class ques8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num");
        int t=sc.nextInt();
        int rev=0; int d; int n=t;
        while(n>0)
        {
            d=n%10;
            rev=rev*10+d;
            n=n/10;
        }
        if(t==rev)
        System.out.println("its pallindrome");
    else
        System.out.println("its not");
    }
}
