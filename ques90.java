import java.util.*;
public class ques90 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String s=sc.nextLine();
        int l=s.length(); int count=0;
        for(int i=0;i<l;i++)
        {
            for(int j=0;j<l;j++)
            {
                if(s.charAt(i)==s.charAt(j))
                    count++;
            }
            if(count!=1) {
                System.out.println(s.charAt(i)+" is first repeating char");
                break;}
                 count=0;
    }
}
}
