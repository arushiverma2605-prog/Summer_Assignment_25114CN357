import java.util.*;

public class ques100 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String word[]=new String[5];

        System.out.println("Enter 5 Words");

        for(int i=0;i<5;i++)
        {
            word[i]=sc.nextLine();
        }

        for(int i=0;i<4;i++)
        {
            for(int j=i+1;j<5;j++)
            {
                if(word[i].length()>word[j].length())
                {
                    String temp=word[i];
                    word[i]=word[j];
                    word[j]=temp;
                }
            }
        }

        System.out.println("Words Sorted by Length");

        for(int i=0;i<5;i++)
        {
            System.out.println(word[i]);
        }

    }
}