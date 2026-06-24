import java.util.*;
public class ques106 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int id[]=new int[100];
        String name[]=new String[100];
        String dob[]=new String[100];
        double salary[]=new double[100];
        
        int count=0; int choice;
        do{
            System.out.println("enter 1 to add employee");
            System.out.println("enter 2 to display employees");
            System.out.println("enter 3 to edit employee details");
            System.out.println("enter 4 to search employee");
            System.out.println("enter 5 to remove employee");
            System.out.println("enter 6 to exit employee");
            
            System.out.println("enter choice");
             choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("enter id");
                    id[count]=sc.nextInt();

                    System.out.println("enter name");
                    name[count]=sc.nextLine();
                    System.out.println("enter date of birth");
                    dob[count]=sc.nextLine();
                    System.out.println("enter salary");
                    salary[count]=sc.nextDouble();
                    count++;
                    System.out.println("employee added");
                    break;
                
                case 2:
                    System.out.println("ID     NAME     DOB     SALARY");
                    for(int i=0;i<count;i++)
                    {
                        System.out.println(id[i]+"     "+name[i]+"     "+dob[i]+"     "+salary[i]);
                    }
                    break;
                case 3:
                    boolean found=false;
                    System.out.println("enter employee id to edit");
                    int eid=sc.nextInt();
                    for(int i=0;i<count;i++)
                    {
                        if(eid==id[i]) {
                            System.out.println("enter new name");
                            name[i]=sc.nextLine();
                            System.out.println("enter new salary");
                            salary[i]=sc.nextDouble();
                            System.out.println("record updated");
                            found=true;  }
                    }
                    if(found==false)
                        System.out.println("employee not found");
                    break;
                case 4:
                     found=false;
                    System.out.println("search id");
                    int sid=sc.nextInt();
                    for(int i=0;i<count;i++)
                    {
                       if(sid==id[i]) {
                        System.out.println("employee found");
                        System.out.println(id[i]+"   "+name[i]+"   "+dob[i]+"   "+salary[i]);
                        found=true; break; }
                    }
                    if(found==false)
                      System.out.println("employee not found");
                    break;
                case 5:
                     found=false;
                     System.out.println("enter employee id to remove");
                     int rid=sc.nextInt();
                     for(int i=0;i<count;i++)
                     {
                        if(rid==id[i])
                        {
                            for(int j=i;j<count-1;j++)
                            {
                                id[j]=id[j+1];
                                name[j]=name[j+1];
                                dob[j]=dob[j+1];
                                salary[j]=salary[j+1];
                            }
                            count--;
                            found=true;
                            System.out.println("employee removed");
                            break;
                        }
                        
                     }
                     if(found==false){
                            System.out.println("employee not found"); }
                            break;
                case 6:
                    System.out.println("program ended");
                    break;
            }
        }while(choice!=0);
    }
}
