import java.util.*;
public class ques95 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a sentence");
        String s=sc.nextLine();
         String a[]=s.split(" ");
         String longest=a[0];
         for(int i=0;i<a.length;i++)
         {
            if(a[i].length()>longest.length())
                longest=a[i];
         }
         System.out.println("longest word = "+longest+" with length "+longest.length());
    }
}
