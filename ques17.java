import java.util.*;
public class ques17{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int q=1;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
                q=q+i;
        }
        if(n==q)
            System.out.println("its perfect num");
        else
            System.out.println("its not");
    }
}