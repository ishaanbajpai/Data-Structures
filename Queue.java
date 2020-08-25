import java.util.Scanner;
public class Queue{
static int size = 10;
static int queue[] = new int[size];
static int front = -1, rear = -1;
public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    Queue object = new Queue();
    for(int i=0;i<size;i++)
        object.enqueue(obj.nextInt());
    object.enqueue(20);
    for(int i=0;i<size;i++)
        System.out.println(object.dequeue());
    System.out.println(object.dequeue());
}
public void enqueue(int n)
{
    if(front==-1 && rear==-1)
            front = rear = 0;
    if(isFull())
    {
        System.out.println("There is no space");
        return;
    }
    else
        queue[rear++]=n;
}
public int dequeue()
{
    if(isEmpty())
    {
        System.out.println("The queue is empty");
        return -1;
    }
    else
        return queue[front++];
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