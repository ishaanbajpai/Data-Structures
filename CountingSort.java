import java.util.Scanner;
public class CountingSort {
    static int arr[];
    public void countingSort(int arr[], int n)
    {
        int count[] = new int[10];
        int output[] = new int[n];
        for(int i=0;i<10;i++)
            count[i] = 0;
        for(int i=0;i<n;i++)
            ++count[arr[i]];
        for(int i=1;i<10;i++)
            count[i]+=count[i-1];
        for(int i=n-1;i>=0;i--)
        {
            output[count[arr[i]]-1] = arr[i];
            count[arr[i]]--;
        }
        for (int i = 0; i<n; ++i) 
            arr[i] = output[i];
    }
    public static void main(String[] args) {
        int n;
        Scanner obj = new Scanner(System.in);
        n = obj.nextInt();
        arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = obj.nextInt();
        }
        CountingSort obj2 = new CountingSort();
        obj2.countingSort(arr, n);
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}