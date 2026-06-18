import java.util.*;
public class ques86{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any sentence");
        String s=sc.nextLine();
        int g=0;  char z;
        int l=s.length();
        for(int i=0;i<l;i++)
        {
            z=s.charAt(i);
            if(z==' ')
                g++;
        }
        System.out.println("total words = "+(g+1));
    }
}