import java.util.Scanner;

public class ques68 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1st array");
        int a[]=new int[5];
        for(int i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("enter 2nd array");
        int b[]=new int[5];
        for(int i=0;i<5;i++)
        {
            b[i]=sc.nextInt();
        }
        boolean found=false;
        System.out.print("intersection of array = ");
        for(int i=0;i<5;i++)
        {
              found=false;
            for(int j=0;j<5;j++)
            {
                if(a[i]==b[j]) {
                    found=true; break; }
            }
            if(found==true)
                System.out.print(a[i]+",");
        }
    }
}
