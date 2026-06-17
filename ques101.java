import java.util.*;
public class ques101{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("You will only get 3 chances");
        System.out.println("Enter START to begin the game");
        String s=sc.nextLine();
        System.out.println("If num entered=secret num, you'll win the game");
        int secret=6;
        for(int i=1;i<=3;i++)
        {
            System.out.println("Chance-"+i);
            System.out.println("Enter num between 1-10");
            int guess=sc.nextInt();
            if(guess==secret)
            {
                System.out.println("YOU WON");
                break;
            }
            else if(guess>secret)
                System.out.println("too high");
            else
                System.out.println("too low");
        }
    }
}