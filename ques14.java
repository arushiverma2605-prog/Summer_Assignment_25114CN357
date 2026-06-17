import java.util.*;
public class ques14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter range");
        int r=sc.nextInt();
        System.out.println("enter nth term");
        int nth=sc.nextInt();
        int f1=1,f2=1,f3=0;
        System.out.print(f1+","+f2+",");
        for(int i=3;i<=r;i++)
        {
            f3=f1+f2;
            System.out.print(f3+",");
            f1=f2;
            f2=f3;
        }
        f1=1;f2=1;
        System.out.print(f1+","+f2+",");
        for(int i=3;i<=r;i++)
        {
            f3=f1+f2;
            if(i==nth)
                System.out.println("the"+nth+"term ="+f3);
            f1=f2;
            f2=f3;
    }
}
}