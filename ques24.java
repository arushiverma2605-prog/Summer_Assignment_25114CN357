import java.util.*;
public class ques24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a num");
        int n=sc.nextInt();
        System.out.println("enter power");
        int p=sc.nextInt();
        int a=1;
        for(int i=1;i<=p;i++)
        {
            a=a*n;
        }
        System.out.println("ans = "+a);
    }
}
