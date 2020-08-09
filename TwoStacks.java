public class TwoStacks {
    int size,top1,top2,arr[];

    TwoStacks(int n){
        size = n;
        top1 = -1;
        top2 = size;
        arr = new int[n];
    }
    void push1(int x)
    {
        if(top1<top2-1)
            arr[++top1] = x;
        else
        {
            System.out.println("Stack Overflow");
            System.exit(1);
        }
    }
    void push2(int x)
    {
        if(top1<top2-1)
            arr[--top2] = x;
        else
        {
            System.out.println("Stack Overflow");
            System.exit(1);
        }
    }
    int pop1()
    {
        if(top1>=0)
            return arr[--top1];
        else
        {
            System.out.println("Stack Underflow");
            System.exit(1);
        }
        return 0;
    }
    int pop2()
    {
        if(top2<size)
            return arr[++top2];
        else
        {
            System.out.println("Stack Underflow");
        }
        return 0;
    }
    public static void main(String[] args) {
        TwoStacks ts = new TwoStacks(5);
        ts.push1(5); 
        ts.push2(10); 
        ts.push2(15); 
        ts.push1(11); 
        ts.push2(7); 
        System.out.println("Popped element from stack1 is " + ts.pop1()); 
        ts.push2(40); 
        System.out.println("Popped element from stack2 is " + ts.pop2());
    }
}