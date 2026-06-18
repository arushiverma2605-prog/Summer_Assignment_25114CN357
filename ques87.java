import java.util.*;
public class ques87 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String s=sc.nextLine();
        char z; int count=0;
        for(int i=0;i<s.length();i++)
        {
            z=s.charAt(i);
            String temp="";
            for(int j=0;j<s.length();j++)
            {
                if(z==s.charAt(j))
                    count++;
                else
                    temp=temp+s.charAt(j);
            }
            s=temp;
            System.out.println("freq of "+z+"="+count);
            count=0;
        }
    }
}
