import java.util.*;
public class ques93 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String s=sc.next();
        int l=s.length();
        System.out.println("enter rotation");
        String r=sc.next();
        String rotation=s.substring(l-2)+s.substring(0,l-2);
        if(r.equals(rotation))
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
