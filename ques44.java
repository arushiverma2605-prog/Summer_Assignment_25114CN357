import java.util.*;
public class ques44 {
    int fact(int n)
    {
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any num");
        int n=sc.nextInt();
        ques44 obj=new ques44();
        int c=obj.fact(n);
        System.out.println("factorial of num = "+c);
    }
}
