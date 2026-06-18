import java.util.*;
public class ques88 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a sentence");
        String s=sc.nextLine();
        int l=s.length();
        char z;
        for(int i=0;i<l;i++)
        {
            z=s.charAt(i);
            if(z==' ')
                {
                    System.out.print(s.charAt(i+1));
                    i++;
                }
                else
                    System.out.print(z);
        }
    }
}
