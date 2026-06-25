import java.util.*;
public class ques47 {
    void fibo(int n)
    {
        int f1=1; int f2=1; int f3;
        System.out.print(f1+","+f2+",");
        for(int i=3;i<n;i++)
        {
            f3=f1+f2;
            System.out.print(f3+",");
            f1=f2;  f2=f3;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter range");
        int r=sc.nextInt();
        ques47 obj=new ques47();
        obj.fibo(r);
    }
}
