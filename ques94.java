import java.util.*;
public class ques94{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String s=sc.next();
        int l=s.length();
        char z;
        int count=1;
        for(int i=1;i<l;i++)
        {
            if(s.charAt(i)==s.charAt(i-1))
                count++;
            else{
                System.out.print(s.charAt(i-1)+""+count);
                count=1; }
        }
        System.out.print(s.charAt(l-1)+""+count);
    }
}