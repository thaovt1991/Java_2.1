package week3.dsa_stack_queue.ex_queue;

public class Solution {

    public static class Node {
        public int data;
        public Node link;
    }

    public static class Queue {
        Node front ;
        Node rear ;

        public Queue(){
            this.front = null;
            this.rear = null ;
        }
    }

    public static void enQueue(Queue q, int value) {
        Node temp = new Node();
        temp.data = value;
        if (q.front == null) {
            q.front = temp;
        } else q.rear.link = temp;
        q.rear = temp;
        q.rear.link = q.front;
    }

    public static void deQueue(Queue q) {
        if (q.front == null) {
            {
                System.out.println("\nQueue is empty");
            }
        }
        int value = q.front.data;

        if (q.front == q.rear) {
            q.rear = q.front = null;
        } else {
            q.front = q.front.link;
            q.rear.link = q.front;
        }
        System.out.println("\nValue had delete is :" + value);
    }

    public static void displayQueue(Queue q) {
        if (q.front == null) {
            System.out.println("\nQueue is empty");
        } else {
            Node temp = q.front;
            System.out.print("\nElements in  Queue are: ");
            while (temp.link != q.front) {
                System.out.printf(" %d ", temp.data);
                temp = temp.link;
            }
            System.out.printf(" %d", temp.data);
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue() ;
        enQueue(q,14);
        enQueue(q,22);
        enQueue(q,-6);

        displayQueue(q);

        deQueue(q);
        deQueue(q);
        displayQueue(q);

        enQueue(q,9);
        enQueue(q,20);
        displayQueue(q);

    }
}
