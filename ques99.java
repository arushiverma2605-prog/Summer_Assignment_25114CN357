import java.util.*;

public class ques99 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String name[]=new String[5];

        System.out.println("Enter 5 Names");

        for(int i=0;i<5;i++)
        {
            name[i]=sc.nextLine();
        }

        for(int i=0;i<4;i++)
        {
            for(int j=i+1;j<5;j++)
            {
                if(name[i].compareTo(name[j])>0)
                {
                    String temp=name[i];
                    name[i]=name[j];
                    name[j]=temp;
                }
            }
        }

        System.out.println("Names in Alphabetical Order");

        for(int i=0;i<5;i++)
        {
            System.out.println(name[i]);
        }

    }
}