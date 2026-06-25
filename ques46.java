import java.util.*;
public class ques46 {
    int ans(int t)
    {
        int d;int sum=0; int z=t;
        while(z!=0)
        {
            d=z%10;
            sum=sum+(d*d*d);
            z=z/10;
        }
        if(t==sum)
        return sum;
    else
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a num");
        int n=sc.nextInt();
        ques46 obj=new ques46();
        int c=obj.ans(n);
        if(c==0)
            System.out.println("its armstrong");
        else
            System.out.println("its not");
    }
}
