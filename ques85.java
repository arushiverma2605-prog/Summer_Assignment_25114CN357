import java.util.*;
public class ques85 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String s=sc.nextLine();
        int l=s.length();   String rev="";
        char z;
        for(int i=l-1;i>=0;i--)
        {
            z=s.charAt(i);
            rev=rev+z;
        }
        if(s.equals(rev))
            System.out.println("its pallindrome");
        else
            System.out.println("its not");

    }
}
