import java.util.*;
public class ques48 {
    int pft(int z)
    {
        int q=1;
    for(int i=2;i<z/2;i++)
    {
        if(z%i==0)
        q=q+i;  }
    if(z==q)
        return z;
    else
        return 0;
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a num");
    int n=sc.nextInt();
    ques48 obj=new ques48();
    int c=obj.pft(n);
    if(c==0)
    {
        System.out.println("its not perfect");
    }
    else
        System.out.println("its perfect");
}
}

