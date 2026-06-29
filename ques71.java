import java.util.*;

public class ques71 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[5];

        System.out.println("Enter 5 Sorted Elements");

        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.print("Enter Element to Search ");
        int key=sc.nextInt();

        int low=0;
        int high=4;
        boolean found=false;

        while(low<=high)
        {
            int mid=(low+high)/2;

            if(arr[mid]==key)
            {
                System.out.println("Element Found at Index "+mid);
                found=true;
                break;
            }
            else if(key<arr[mid])
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }

        if(!found)
        {
            System.out.println("Element Not Found");
        }

    }
}