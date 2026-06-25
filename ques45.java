import java.util.*;
public class ques45 {
    int pallin(int t)
    {
        int rev=0; int d; int x=t;
        while(x!=0)
        {
            d=x%10;
            rev=rev*10+d;
            x=x/10;
        }
        if(t==rev)
        return rev;
    else
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num");
        int n=sc.nextInt();
        ques45 obj=new ques45();
        int c=obj.pallin(n);
        if(c==0)
            System.out.println("its pallindrome");
        else
            System.out.println("its not");
    }
}
