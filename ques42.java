import java.util.*;
public class ques42 {
    int max(int x,int y,int z)
    {
        if(x>y && x>z)
            return x;
        else if(y>x && y>z)
            return y;
        else
            return z;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1 num");
        int a=sc.nextInt();
        System.out.println("enter 2 num");
        int b=sc.nextInt();
        System.out.println("enter 3 num");
        int c=sc.nextInt();
        ques42 obj=new ques42();
        int m=obj.max(a,b,c);
        System.out.println("maximum num "+m);
    }
}
