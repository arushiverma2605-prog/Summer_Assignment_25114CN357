import java.util.*;
public class ques41 {
    int sum(int x,int y)
    {
        int z=x+y;
        return z;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1st num");
        int a=sc.nextInt();
        System.out.println("enter 2nd num");
        int b=sc.nextInt();
        ques41 obj=new ques41();
        int c=obj.sum(a,b);
        System.out.println("sum of two numbers "+c);
    }
}
