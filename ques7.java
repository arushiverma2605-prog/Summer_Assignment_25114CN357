import java.util.*;
public class ques7 {
    public static void main(String[] args) {
   {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter a num");
            int t=sc.nextInt();
            int prd=1; int n=t; int d;
            while (n>0) 
                {
                d=n%10;
                prd=prd*d;
                n=n/10;
            }
            System.out.println("product="+prd);
    }
    }
}
