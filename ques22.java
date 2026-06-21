import java.util.*;
public class ques22 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter binary num");
        int t=sc.nextInt();
        int n=t; int d; int r=0; int i=0;
        while(n>0)
        {
            d=n%10;
            r=r+(int)(d*Math.pow(2,i));
            i++;
            n=n/10;
        }
        System.out.println("decimal "+r);
    }
}
