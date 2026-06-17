import java.util.*;
public class ques16 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter range");
        int r=sc.nextInt();
        int d; int sum=0; int n;
        for(int i=1;i<=r;i++)
        {
            n=i;
            while(n>0)
            {
                d=n%10;
                sum=sum+d*d*d;
                n=n/10;
            }
            if(i==sum)
                System.out.println(i);
            sum=0;
        }
    }
}
