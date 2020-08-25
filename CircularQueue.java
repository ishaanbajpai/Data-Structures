import java.util.Scanner;
public class CircularQueue{
    int front=-1,rear=-1;
    static int size = 10;
    static int arr[] = new int[size];
    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue();
        Scanner obj = new Scanner(System.in);
        for(int i=0;i<size;i++)
        {
            cq.enqueue(obj.nextInt());
        }
        System.out.println(cq.dequeue());
        System.out.println(cq.dequeue());
        cq.enqueue(888);
    }
    public void enqueue(int n)
    {
        if(front==-1 && rear==-1)
                front = rear = 0;
        if(isFull())
        {
            rear = (rear+1)%size;
            if(front==0)
            {
                System.out.println("No space in queue");
                return;
            }
        }
            arr[rear++]=n;
    }
    public int dequeue()
    {
        if(isEmpty())
        {
            System.out.println("The queue is empty");
            return -1;
        }
        else
            return arr[front++];
    }
    Boolean isEmpty()
    {
        if(front==-1||front>=size)
            return true;
        else
            return false;
    }
    Boolean isFull()
    {
        if(rear>size-1)
            return true;
        else
            return false;
    }
}