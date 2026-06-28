import java.util.*;

public class ques116 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int id[] = new int[10];
        String name[] = new String[10];
        int qty[] = new int[10];
        double price[] = new double[10];

        int count = 0;
        int choice;

        do 
        {
            System.out.println("===== INVENTORY MANAGEMENT SYSTEM =====");
            System.out.println("1 Add Product");
            System.out.println("2 Display Products");
            System.out.println("3 Update Quantity");
            System.out.println("4 Search Product");
            System.out.println("5 Delete Product");
            System.out.println("6 Exit");
            System.out.print("Enter your choice");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    if (count < 10) {

                        System.out.print("Enter Product ID");
                        id[count] = sc.nextInt();

                        System.out.print("Enter Product Name");
                        name[count] = sc.nextLine();

                        System.out.print("Enter Quantity");
                        qty[count] = sc.nextInt();

                        System.out.print("Enter Price");
                        price[count] = sc.nextDouble();
                        count++;
                        System.out.println("Product Added Successfully");

                    } else {

                        System.out.println("Inventory Full");

                    }

                    break;

                case 2:

                    if (count == 0) {

                        System.out.println("No Products Available.");

                    } else {

                        System.out.println("ID\tName\tQuantity\tPrice");

                        for (int i = 0; i < count; i++) {

                            if (name[i] != null) {

                                System.out.println(id[i] + "\t" +
                                        name[i] + "\t" +
                                        qty[i] + "\t\t" +
                                        price[i]);
                            }
                        }
                    }

                    break;

                case 3:

                    System.out.print("Enter Product ID");
                    int update = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {

                        if (id[i] == update && name[i] != null) {

                            System.out.print("Enter New Quantity");
                            qty[i] = sc.nextInt();

                            System.out.println("Quantity Updated");

                            found = true;
                            break;

                        }

                    }

                    if (found==false) {

                        System.out.println("Product Not Found");

                    }

                    break;

                case 4:

                    System.out.print("Enter Product ID: ");
                    int search = sc.nextInt();

                    found = false;

                    for (int i = 0; i < count; i++) {

                        if (id[i] == search && name[i] != null) {

                            System.out.println("Product ID : " + id[i]);
                            System.out.println("Product Name : " + name[i]);
                            System.out.println("Quantity : " + qty[i]);
                            System.out.println("Price : " + price[i]);

                            found = true;
                            break;

                        }

                    }

                    if (!found) {

                        System.out.println("Product Not Found");

                    }

                    break;

                case 5:

                    System.out.print("Enter Product ID to Delete");
                    int del = sc.nextInt();

                    found = false;

                    for (int i = 0; i < count; i++) {

                        if (id[i] == del && name[i] != null) {

                            id[i] = 0;
                            name[i] = null;
                            qty[i] = 0;
                            price[i] = 0;

                            System.out.println("Product Deleted Successfully");

                            found = true;
                            break;

                        }

                    }

                    if (!found) {

                        System.out.println("Product Not Found");

                    }

                    break;

                case 6:

                    System.out.println("Thank You");
                    break;

                default:

                    System.out.println("Invalid Choice");
            }

        } while (choice != 6);
    }
}