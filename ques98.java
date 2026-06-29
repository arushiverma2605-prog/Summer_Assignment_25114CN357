import java.util.*;

public class ques98 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter First String");
        String s1=sc.nextLine();

        System.out.print("Enter Second String");
        String s2=sc.nextLine();

        System.out.println("Common Characters");

        for(int i=0;i<s1.length();i++)
        {
            char ch=s1.charAt(i);

            for(int j=0;j<s2.length();j++)
            {
                if(ch==s2.charAt(j))
                {
                    System.out.print(ch+" ");
                    break;
                }
            }
        }

    }
}