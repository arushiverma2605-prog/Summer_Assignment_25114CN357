import java.util.*;
public class ques92 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String s=sc.nextLine();
        int l=s.length();
        char z; int max=0; int count=0; char maxchar=' ';
        for(int i=0;i<l;i++)
        {
            for(int j=0;j<l;j++)
            {
               if(s.charAt(i)==s.charAt(j))
                count++;
            }
            if(count>max) {
                max=count;
                maxchar=s.charAt(i);   }
                count=0;
        }
        System.out.println("max occuring char = "+maxchar+" with freq "+max);
    }
}
