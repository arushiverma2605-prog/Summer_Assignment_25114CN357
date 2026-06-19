import java.util.*;
public class ques64 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length");
        int l=sc.nextInt();
        int a[]=new int[l];
        System.out.println("enter array elements");
        for(int i=0;i<l;i++)
        {
            a[i]=sc.nextInt();
        }
        boolean duplicate=false;
        for(int i=0;i<l;i++)
        {
            for(int j=i+1;j<l;j++)
            {
                if(a[i]==a[j]){
                    duplicate=true;
                    break;}
            }
            if(duplicate==false)   
            System.out.print(a[i]+",");
            duplicate=false;
        }
    }
}
