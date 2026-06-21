import java.util.*;
public class ques18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a num");
        int t=sc.nextInt();
        int d; int f=1; int sum=0; int n=t;
        while(n!=0)
        {
            f=1;
            d=n%10;
            for(int i=1;i<=d;i++)
            {
                f=f*i;
            }
            sum=sum+f;
            n=n/10;
        }
        if(t==sum)
            System.out.println("its a strong num");
        else
            System.out.println("its not");
    }
}
