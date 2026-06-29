import java.util.*;
public class ques69{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array");
        int a[]=new int[5];
        for(int i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
        
         int temp=0; boolean sort=false;
         for(int i=1;i<5;i++)      //number of rounds
         {
            sort=false;
            for(int j=0;j<5-i;j++)    //traverse
            {
                if(a[j]>a[j+1])
                    {
                        temp=a[j];
                        a[j]=a[j+1];
                        a[j+1]=temp;
                        sort=true;
                    }
            }
            if(sort==false)
                break;
         }
          System.out.println("sorted array");
          for(int i=0;i<5;i++)
          {
            System.out.print(a[i]+",");
          }
    }
}