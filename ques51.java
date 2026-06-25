import java.util.*;
public class ques51 {
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
        int max=a[0];int min=a[0];
        System.out.println("array elements are ");
        for(int i=0;i<l;i++)
        {
            System.out.print(a[i]+",");
            if(max<a[i])
                max=a[i];
            if((min>a[i]))
                min=a[i];
        }
        System.out.println("maximum element= "+max);
        System.out.println("minimum element= "+min);
    }
}
