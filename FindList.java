import java.util.Scanner;
public class FindList {
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
    public void findNode(int k) {
        Node n = head;
        int count = 0;
        while(n.next!=null && n.data!=k)
        {
            n = n.next;
            count++;
        }
        if(n.next==null)
        {
            System.out.println("Element not present in the list");
            return;
        }
        else
        {
            System.out.println("Element present at the node number"+count);
        }
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        FindList list = new FindList();
        System.out.println("Enter number of nodes you want to enter: ");
        int n = obj.nextInt();
        for(int i=0;i<n;i++)
        {
            list.insert(obj.nextInt());
        }
        list.printList();
        System.out.println("Enter the value you want to search");
        int k = obj.nextInt();
        list.findNode(k);
    }
}