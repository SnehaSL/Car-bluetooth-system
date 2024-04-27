import java.util.*;
public class queueusinglinkedlist {
    int count = 0;

    // A linked list (LL) node to store a queue entry
    class QNode {
        String key;
        QNode next;

        // constructor to create a new linked list node
        public QNode(String key) {
            this.key = key;
            this.next = null;
        }
    }

    QNode front, rear;

    public void Queue() {
        this.front = this.rear = null;
    }

    // Method to add an key to the queue.
    void enqueue(String key) {
        count++;

        // Create a new LL node
        QNode temp = new QNode(key);

        // If queue is empty, then new node is front and
        // rear both
        if (this.rear == null) {
            this.front = this.rear = temp;
            return;
        }


        // Add the new node at the end of queue and change
        // rear
        this.rear.next = temp;
        this.rear = temp;
    }

    // Method to remove an key from queue.
    void dequeue() {
        // If queue is empty, return NULL.
        if (this.front == null)
            return;

        // Store previous front and move front one node
        // ahead
        count--;
        QNode temp = this.front;
        this.front = this.front.next;

        // If front becomes NULL, then change rear also as
        // NULL
        if (this.front == null)
            this.rear = null;
    }

    public int size() {
        return count;
    }

    public String frontelement() {
        return front.key;
    }

    public void display() {
        if (this.front == null) {
            System.out.println(" No paired devices");
        } else {
            System.out.println(" PAIRED DEVICES ARE :");
            QNode data = front;
            while (data != null) {
                System.out.println(data.key);
                data = data.next;
            }

        }

    }

}



