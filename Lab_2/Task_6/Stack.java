package Lab_2.Task_6;

/*(The stack) A stack stores data using first-in, last-out ordering. That is, a stack is like a stack of plates on a
table—the first plate put down on the table is the last plate to be used. Stacks are controlled through two operations 
traditionally called push and pop. To put an item on top of the stack, you will use push. To take an item off the 
stack, you will use pop.The stack of integers can be held by a 10-element array stck. This array is indexed by the
variable tos, which always contains the index of the top of the stack. The Stack( ) constructor initializes tos to
–1, which indicates an empty stack.Test the Stack class by pushing/popping elements and printing on screen the stack status.
 */

class MyStack 
{
    private int[] myStackArray;
    private int topOfStack;

    // Initialize the stack
    MyStack(int size) 
    {
        myStackArray = new int[size];
        topOfStack = -1; // stack is empty
    }

    // Push an item onto the stack
    void push(int item) 
    {
        if (topOfStack == myStackArray.length - 1) 
        {
            System.out.println("Stack is full.");
        } else 
        {
            myStackArray[++topOfStack] = item;
            System.out.println(item + " pushed to stack.");
        }
    }

    // Pop an item from the stack
    int pop() 
    {
        if (topOfStack < 0) 
        {
            System.out.println("Stack is empty.");
            return 0;
        } else 
        {
            System.out.println(myStackArray[topOfStack] + " popped from stack.");
            return myStackArray[topOfStack--];
        }
    }
}

public class Stack 
{
    public static void main(String[] args) 
    {
        MyStack stack = new MyStack(10);

        // Pushing elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        // Popping elements from the stack
        stack.pop();
        stack.pop();

        // Pushing more elements
        stack.push(50);
        stack.push(60);

        // Popping until empty
        while (stack.pop() != 0);

    }
}

