import java.util.*;
public class ques20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a num");
        int n=sc.nextInt();
        int prime=1; int max=1;
        for(int i=2;i<=n;i++)
        {
            if(n%i==0)
            {
                prime=1;
                for(int j=2;j<=i/2;j++)
                {
                    if(i%j==0){
                        prime=0;break; }
                }
                if(prime!=0){
                    if(max<i)
                        max=i; }
            }
        }
        System.out.println("largest rpime factor "+max);
    }
}
