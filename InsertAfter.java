import java.util.Scanner;
public class InsertAfter
{
    Node head;
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
        Node newNode2 = new Node(d);
        if(head == null)
        {
            head = newNode2;
            return;
        }
        Node last = head;
        while(last.next!=null)
        {
            last = last.next;
        }
        last.next = newNode2;
        return;
    }
    public void printList()
    {
        Node n = head;
        while(n!=null)
        {
            System.out.print(n.data+" ");
            n = n.next;
        }
        return;
    }
    public void insert2(int k, int m)//m is the existing node whereas k is the new node;
    {
        Node newNode = new Node(k);
        Node n = head;
        while(n!=null && n.data != m)
        {
            n = n.next;
        }
        if(n==null)
        {
            System.out.println("The node is null, execution terminated explicitly");
            return;
        }
        newNode.next = n.next;
        n.next = newNode;
        return;
    }
    public static void main(String[] args) 
    {
        InsertAfter listt = new InsertAfter();
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number of nodes you want to enter: ");
        int n = obj.nextInt();
        int k=0;
        System.out.println("Enter the nodes of the list: ");
        for(int i=0;i<n;i++)
        {
            listt.insert(obj.nextInt());
        }
        listt.printList();
        System.out.println();
        System.out.println("Enter the existing node after which you want to put the new node: ");
        k = obj.nextInt();
        System.out.println("Enter the new node you want to insert: ");
        int m = obj.nextInt();
        listt.insert2(m, k);
        listt.printList();
        obj.close();
    }
}