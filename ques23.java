import java.util.*;
public class ques23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a num");
        int t=sc.nextInt();
        int n=t; String b=""; int d;
        while(n>0)
        {
            d=n%2;
            b=d+b;
            n=n/2;
        }
        System.out.println("binary "+b);
        int B=Integer.valueOf(b);
        int D; int flag=0;
        while(B>0)
        {
            D=B%10;
            if(D==1){
                flag++;}
            B=B/10;
        }
        System.out.println("set bits = "+flag);
    }
}
