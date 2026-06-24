import java.util.*;
public class ques107 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID");
        int id = sc.nextInt();

        System.out.print("Enter Employee Name");
        String name = sc.nextLine();

        System.out.print("Enter Basic Salary");
        double basic = sc.nextDouble();

        double hra = basic*0.20;     // 20% HRA
        double da = basic*0.10;      // 10% DA
        double pf = basic*0.05;      // 5% PF deduction

        double gross = basic+hra+da;
        double net = gross-pf;

        System.out.println("----- SALARY SLIP -----");
        System.out.println("Employee ID   : " + id);
        System.out.println("Employee Name : " + name);
        System.out.println("Basic Salary  : " + basic);
        System.out.println("HRA           : " + hra);
        System.out.println("DA            : " + da);
        System.out.println("PF            : " + pf);
        System.out.println("Net Salary    : " + net);
}
}
