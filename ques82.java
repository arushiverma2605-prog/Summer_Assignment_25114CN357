import java.util.*;
public class ques82 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String s=sc.nextLine();
        int l=s.length();
        char z;
        for(int i=l-1;i>=0;i--)
        {
            z=s.charAt(i);
            System.out.print(z);
        }
    }
}
