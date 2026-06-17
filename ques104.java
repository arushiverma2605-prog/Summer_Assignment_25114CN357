import java.util.*;
public class ques104{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ques1:Enter capital of india");
        System.out.println("1.Delhi, 2.Mumbai, 3.Bangluru");
        int ans1=sc.nextInt();
        if(ans1==1)
            System.out.println("CORRECT");
        else
            System.out.println("WRONG");
        System.out.println("Ques2: 5+2=?");
        System.out.println("a.35, b.7, c.3");
        char ans2=sc.next().charAt(0);
        if(ans2=='b')
            System.out.println("CORRECT");
        else
            System.out.println("WRONG");
        int marks;
        if(ans1==1 && ans2=='b')
            marks=10;
        else if(ans1!=1 && ans2!='b')
            marks=0;
        else
            marks=5;
        System.out.println("MARKS="+marks);
    }
}