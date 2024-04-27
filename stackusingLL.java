import static java.lang.System.exit;

public class stackusinglinkedlist {
    // A linked list node
    private class Node {

        String data; // integer data
        Node link; // reference variable Node type
    }

    // create global top reference variable global
    Node top;

    // Constructor
    stackusinglinkedlist() {
        this.top = null;
    }

    // Utility function to add an element x in the stack
    public void push(String x) // insert at the beginning
    {
        // create new node temp and allocate memory
        Node temp = new Node();

        // check if stack (heap) is full. Then inserting an
        //  element would lead to stack overflow
        if (temp == null) {
            System.out.print("\nHeap Overflow");
            return;
        }

        // initialize data into temp data field
        temp.data = x;

        // put top reference into temp link
        temp.link = top;

        // update top reference
        top = temp;
    }

    // Utility function to check if the stack is empty or
    // not
    public boolean isEmpty() {
        return top == null;
    }

    // Utility function to return top element in a stack
    public String peek() {
        // check for empty stack
        if (!isEmpty()) {
            return top.data;
        } else {
            //System.out.println("Stack is empty");
            return null;
        }
    }

    // Utility function to pop top element from the stack
    public void pop() // remove at the beginning
    {
        // check for stack underflow
        if (top == null) {
            //System.out.print("\nStack Underflow");
            return;
        }

        // update the top pointer to point to the next node
        top = (top).link;
    }
}

