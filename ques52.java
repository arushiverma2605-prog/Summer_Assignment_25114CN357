import java.util.*;
public class ques52 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length");
        int l=sc.nextInt();
        System.out.println("enter array");
        int a[]=new int[l];
        for(int i=0;i<l;i++)
        {
            a[i]=sc.nextInt();
        }
        int e=0; int o=0;
        for(int i=0;i<l;i++)
        {
            if(a[i]%2==0){
                e++; }
            else {
                o++;}
            System.out.print(a[i]+",");
        }
        System.out.println();
        System.out.println("even elements = "+e);
        System.out.println("odd elements = "+o);
    }
}
