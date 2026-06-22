import java.util.*;
public class ques67 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 1st array");
        int a[]=new int[5];
        for(int i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
        int b[]=new int[5];
        System.out.println("enter 2nd array");
        for(int i=0;i<5;i++)
        {
            b[i]=sc.nextInt();
        }
        System.out.println("intersection of array");
        int count=0;
        for(int i=0;i<5;i++)
        { 
            count=0;
            for(int j=0;j<i;j++)
            {
                if(a[i]==a[j]) {
                    count++; break; }
            }
            if(count>0)
                continue;
            
            for(int k=0;k<5;k++)
            {
                if(a[i]==b[k]){
                    System.out.print(a[i]+","); break;}
            }
        }
    }
}
