import java.util.*;
public class ques102 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your age");
        int a=sc.nextInt();
        if(a>=18)
            System.out.println("YOU CAN VOTE");
        else
            System.out.println("YOU CAN'T VOTE");
    }
}
