import java.util.*;
public class ques43 {
    int prm(int x)
    {
        int prime=1;
        for(int i=2;i<=x/2;i++)
        {
            if(x%i==0)
            {
                prime=0;
                break;
            }
        }
        if(prime==1)
            return x;
        else
            return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a num");
        int n=sc.nextInt();
        ques43 obj=new ques43();
        int c=obj.prm(n);
        if(c==0)
            System.out.println("its not prime "+c);
        else
            System.out.println("its prime "+c);
    }
}
