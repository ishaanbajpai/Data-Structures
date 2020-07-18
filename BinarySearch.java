import java.util.Scanner;
public class BinarySearch
{
    public static void main(String[] args) 
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = obj.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = obj.nextInt();
        }
        BinarySearch obj2 = new BinarySearch();
        System.out.println("Enter the number to be searched: ");
        int x = obj.nextInt();
        int res = obj2.binary(arr, 0, n-1, x);
        if(res==-1)
            System.out.println("Element not present");
        else
            System.out.println("Element present at position "+res);
            obj.close();
    }
    int binary(int arr[], int l, int r, int x) 
    {
        if(r>=l)
        {
            int mid = l+(r-l)/2;
            if(arr[mid]==x)
                return mid;

            if(arr[mid]>x)
                return binary(arr, l, mid-1, x);

            return binary(arr, mid+1, r, x);
        }
    return -1;
    }
}