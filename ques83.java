import java.util.*;

import javax.sound.sampled.SourceDataLine;
public class ques83 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string");
        String n=sc.nextLine();
        int l=n.length();
        char z; int c=0; int v=0;
        for(int i=0;i<l;i++)
        {
            z=n.charAt(i);
        if(z=='a'||z=='e'||z=='i'||z=='o'||z=='u'||z=='A'||z=='E'||z=='I'||z=='O'||z=='U')
            v++;
        else
            c++; }
        System.out.println("total vowels="+v+ ", total consonants=" +c);
    }
}
