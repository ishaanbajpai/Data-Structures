import java.util.Scanner;
public class InsertEnd{
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

        //newNode.next = null;
        
        while(last.next!=null)
            last = last.next;
            
        last.next = newNode;
        return;
    }
    public void insertbeg(int d)
    {
        Node newNode = new Node(d);
        newNode.next = head;
        head = newNode;
        return;
    }
    public void printlist()
    {
        Node n = head;
        while(n!=null)
        {
            System.out.println(n.data);
            n = n.next;
        }
        return;
    }
    public static void main(String[] args) {
        InsertEnd listt = new InsertEnd();
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        for(int i=0;i<n;i++)
        {
            listt.insert(obj.nextInt());
        }
        //listt.insert(5);
        //listt.insert(25);
        listt.insertbeg(10);
        listt.printlist();
    }
}