import java.util.*;
public class ques61 {
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
        System.out.println("enter the element to be searched");
        int n=sc.nextInt();
        int flag=0; int place=0;
        for(int i=0;i<l;i++)
        {
            if(a[i]==n){
            flag++;
            place=i;
            }
        }
        if(flag==0)
            System.out.println("element not found");
        else
            System.out.println("element found at ="+(place+1) +"position");
    }
}
