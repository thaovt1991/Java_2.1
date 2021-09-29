package ex_DSA;

import java.util.LinkedList;

public class QueueLinkedList<E> {
    private LinkedList<E> QueueLinkedList;
    private int size;

    public QueueLinkedList() {
        QueueLinkedList = new LinkedList();
        this.size = 0;
    }

    public boolean isEmpty() {
        if (size == 0) return true;
        return false;
    }

    public void enQueue(E element) {
        QueueLinkedList.addFirst(element);
        size++;
    }

    public E deQueue() {
        if (isEmpty()) return null;
        size--;
        return (E) QueueLinkedList.pollLast();
    }

    public E peek() {
        return (E) QueueLinkedList.peek();
    }

    public int size() {
        return this.size;
    }

    @Override
    public String toString() {
        if(isEmpty()) return "Queue Empty!";
        String str = "";
        int i = size - 1;
        int j = 1;
        while (i >= 0) {
            str += j + ". " + QueueLinkedList.get(i) + "\n";
            i--;
            j++;
        }
        return str;
    }

}
