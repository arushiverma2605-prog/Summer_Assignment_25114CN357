import java.util.*;
public class ques108 {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);

        System.out.print("Enter Name");
        String name=sc.nextLine();

        System.out.print("Enter Roll Number");
        int roll=sc.nextInt();

        System.out.print("Enter marks in MATHS");
        int m=sc.nextInt();

        System.out.print("Enter marks in PHYSICS");
        int p=sc.nextInt();

        System.out.print("Enter marks in CHEMISTRY");
        int c=sc.nextInt();

        System.out.print("Enter marks in ENGLISH");
        int e=sc.nextInt();

        System.out.print("Enter marks in COMPUTER");
        int cp=sc.nextInt();

        int total= p+c+m+e+cp;
        double percentage= total/5.0;

        String grade;
        if (percentage >= 90)
            grade= "A+";
        else if (percentage >= 80)
            grade= "A";
        else if (percentage >= 70)
            grade= "B";
        else if (percentage >= 60)
            grade= "C";
        else if (percentage >= 40)
            grade= "D";
        else
            grade= "F";

        System.out.println("----- MARKSHEET -----");
        System.out.println("Name       : " + name);
        System.out.println("Roll No.   : " + roll);
        System.out.println("Total      : " + total + "/500");
        System.out.println("Percentage : " + percentage + "%");
        System.out.println("Grade      : " + grade);

        if(m<40 || p<40 || c<40 || e<40 || cp<40)
            System.out.println("Result  : FAIL");
        else
            System.out.println("Result  : PASS");
    }
}
