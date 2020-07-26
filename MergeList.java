import java.util.Scanner;
public class MergeList {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }        
    }
    public Node merge(Node x, Node y)
    {
        Node temp = new Node(0);
        Node tail = temp;
        while(true)
        {
            if(x==null)
            {
                tail.next = y;
                break;
            }
            if(y==null)
            {
                tail.next=x;
                break;
            }
            if(x.data<=y.data)
            {
                tail.next = x;
                x = x.next;
            }
            else
            {
                tail.next = y;
                y = y.next;
            }
            tail = tail.next;
        }
        return temp.next;
    }
    public void insert(int d)
    {
        Node newNode = new Node(d);
        Node last = head;

        if(head == null)
        {
            head = newNode;
            return;
        }
        
        while(last.next!=null)
            last = last.next;
            
        last.next = newNode;
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
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        MergeList list1 = new MergeList();
        MergeList list2 = new MergeList();
        System.out.println("Enter the size of the first list: ");
        int n = obj.nextInt();
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++)
        {
            list1.insert(obj.nextInt());
        }
        System.out.println("Enter the size of the second list: ");
        n = obj.nextInt();
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++)
        {
            list2.insert(obj.nextInt());
        }
        list1.head = list1.merge(list1.head, list2.head);
        list1.printList();
    }
}