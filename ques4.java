import java.util.*;
public class ques4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a num");
        int n=sc.nextInt();
        int c=0; int d;
        while(n>0)
        {
            d=n%10;
            c++;
            n=n/10;
        }
        System.out.println("num of digits="+c);
    }
}
