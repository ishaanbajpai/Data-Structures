import java.util.Scanner;
public class QuickSort {
    static int arr[];
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = obj.nextInt();
        }
        QuickSort sortObj = new QuickSort();
        sortObj.sort(arr,0,n-1);
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
    }
    void swap(int x, int y)
    {
        int temp = x;
        x = y;
        y = temp;
    }
    void sort(int arr[], int low, int high)
    {
        if(low<high)
        {
            int res = partition(arr, low, high);
            //System.out.println(res);
            sort(arr, low, res-1);
            sort(arr, res+1, high);
        }
    }
    int partition(int arr[], int low, int high){
        
        QuickSort obj1 = new QuickSort();
        int i=(low-1);
        int pivot = arr[high];
        for(int j=low;j<high;j++)
        {
            if(arr[j]<pivot)
            {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }
}