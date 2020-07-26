import java.util.Scanner;
public class InsertAfter
{
    Node head
    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    public void insert(int d)
    {
        Node newNode = new Node(d);
        if(head == null)
        {
            head = newNode;
            return;
        }
        Node last = head;
        while(last.next!=null)
        {
            last = last.next;
        }
        last.next = newNode;
        return;
    }
    public void printList
    {
        Node n = head;
        while(n!=null)
        {
            System.out.println(n.data+" ");
            n = n.next;
        }
        return;
    }
    public static void main(String[] args) {
        InsertAfter list = new InsertAfter();
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        for(int i=0;i<n;i++)
        {
            list.insert(obj.nextInt());
        }
    }
}