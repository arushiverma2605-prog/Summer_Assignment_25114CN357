import java.util.*;
public class ques89 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String s=sc.nextLine();
        int l=s.length();
        char z; int count=0;
        for(int i=0;i<l;i++)
        {
            for(int j=0;j<l;j++)
            {
                if(s.charAt(i)==s.charAt(j))
                  count++;
            }
            if(count==1){
                System.out.println(s.charAt(i)+" is non repeating");
             break; }
            count=0;
        }

    }    
}
