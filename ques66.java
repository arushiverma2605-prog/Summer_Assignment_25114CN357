import java.util.*;
public class ques66 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first array");
        int a[]=new int[5];
         for(int i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("enter second array");
        int b[]=new int[5];
        for(int i=0;i<5;i++)
        {
            b[i]=sc.nextInt();
        }
        System.out.println("union of arrays is = ");
        for(int i=0;i<5;i++)
        {
            System.out.print(a[i]+",");
        }
        boolean found=false;
        for(int i=0;i<5;i++)
        {
            found=false;
            for(int j=0;j<5;j++)
            {
                if(b[i]==a[j]){
                    found=true; break; }
            }
            if(found==false)
                System.out.print(b[i]+",");
        }
    }
}
