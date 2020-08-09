import java.util.Scanner;
public class Stack{
    static final int MAX = 1000;
    int top;
    int arr[] = new int[MAX];
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        Stack s = new Stack();
        int n = obj.nextInt();
        for(int i=0;i<n;i++)
        {
            s.push(obj.nextInt());
        }
        System.out.println("Element at top is "+s.peek());
        System.out.println("Element removed "+s.pop());
        System.out.println("Element at top is "+s.peek());
    }
    Stack()
    {
        top = -1;
    }
    boolean isEmpty()
    {
        return (top<0);
    }
    boolean push(int x) 
    { 
        if (top >= (MAX - 1)) { 
            System.out.println("Stack Overflow"); 
            return false; 
        } 
        else { 
            arr[++top] = x; 
            System.out.println(x + " pushed into stack"); 
            return true; 
        } 
    }
    int pop() 
    { 
        if (top < 0) { 
            System.out.println("Stack Underflow"); 
            return 0; 
        } 
        else { 
           return arr[top--]; 
        } 
    }
    int peek()
    {
        if(top<0)
        {
            System.out.println("Stack underflor");
            return 0;
        }
        else{
            return arr[top];
        }
    }
}