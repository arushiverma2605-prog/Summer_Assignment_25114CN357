import java.util.*;
public class ques62 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length");
        int l=sc.nextInt();
        int a[]=new int[l];
        
        System.out.println("enter array ele");
        for(int i=0;i<l;i++)
        {
            a[i]=sc.nextInt();
        }
        int count=0; int maxele=a[0]; int maxfreq=0;
        for(int i=0;i<l;i++)
        {
            
            for(int j=i+1;j<l;j++)
            {
                if(a[i]==a[j])
                    count++;
            }
           if(count>maxfreq)
           {
            maxfreq=count;
            maxele=a[i];
           }
            count=0;
        }
        System.out.println("max freq ele="+maxele);

    }
}
