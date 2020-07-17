import java.util.HashSet;
import java.util.Scanner;
public class DuplicateArray{
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<Integer>();
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Number of elements in the Array");
        int n = obj.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = obj.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(set1.add(arr[i])==false)
                System.out.println("The duplicate value is "+arr[i]);
        }
        obj.close();
    }
}