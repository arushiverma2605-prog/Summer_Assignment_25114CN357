import java.util.*;
public class ques103 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER 1 TO CHECK BALANCE");
        System.out.println("ENTER 2 TO DEPOSITE");
        System.out.println("ENTER 3 TO WITHDRAW");
        int e=sc.nextInt();
        int balance=5000;
        if(e==1)
            System.out.println("YOUR BALANCE IS = "+balance);
        else if(e==2)
        {
            System.out.println("ENTER AMOUNT TO DEPOSITE");
            int a=sc.nextInt();
            balance=balance+a;
            System.out.println("NOW YOUR BALANCE IS = "+balance);
        }
        else if(e==3)
        {
            System.out.println("ENTER AMOUNT TO WITHDRAW");
            int a=sc.nextInt();
            balance=balance-a;
            System.out.println("NOW YOUR BALANCE IS = "+balance);
        }
        else
            System.out.println("WRONG CHOICE");
    }
}
