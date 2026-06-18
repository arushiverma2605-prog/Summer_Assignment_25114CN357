import java.util.*;
public class ques84 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String s=sc.nextLine();
        int l=s.length();
        char z;
        for(int i=0;i<l;i++)
        {
            z=s.charAt(i);
            if(z>=97&&z<=122)
            {
                z=Character.toUpperCase(z);
            }
            System.out.print(z);
        }
    }
}
