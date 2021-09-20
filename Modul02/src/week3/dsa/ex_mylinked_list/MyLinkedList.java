package week3.dsa.ex_mylinked_list;


public class MyLinkedList<E> {
    private Node head;
    private int numNodes;
    private Node tail;

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }

        public Node getNext() {
            return next;
        }

        @Override
        public String toString() {
            return "" + getData();
        }
    }

    public MyLinkedList() {
        head = null;
    }


    public MyLinkedList(Object data) {
        head = new Node(data);
    }

    public void add(int index, Object data) {
        Node temp = head;
        Node holder;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(E data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        this.numNodes++;
    }

    public void addLast(E data) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(data);
        tail = temp.next;
        tail.next = null;
        numNodes++;
    }

    public E removeFirst() {
        if (numNodes == 0) return null;
        else {
            Node temp = head;
            head = head.next;
            numNodes--;
            if (head == null) {
                tail = null;
            }
            return (E) temp.data;
        }
    }

    public E removeLast() {
        if (numNodes == 0) return null;
        else if (numNodes == 1) {
            Node temp = head;
            head = null;
            tail = head;
            numNodes = 0;
            return (E) temp.data;
        } else {
            Node current = head;

            for (int i = 0; i < numNodes - 2; i++)
                current = current.next;

            Node temp = current.next;
            tail = current;
            tail.next = null;
            numNodes--;
            return (E) temp.data;
        }
    }

    public E remove(int index) {
        if (index < 0 || index >= numNodes) return null;
        else if (index == 0) return removeFirst();
        else if (index == numNodes - 1) return removeLast();
        else {
            Node previous = head;

            for (int i = 1; i < index; i++) {
                previous = previous.next;
            }

            Node current = previous.next;
            previous.next = current.next;
            numNodes--;
            return (E) current.data;
        }
    }

    public boolean remove(Object e) {
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            temp = temp.next;
            if (temp.data == e) {
                remove(i);
                return true;
            }
        }
        return false;
    }

    public int size() {
        return numNodes;
    }

    public int indexOf(Object data) {
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if (temp.getData().equals(data)) {
                return i;
            }
            temp = temp.next;

        }
        return -1;
    }

    public boolean isContain(Object data) {
        Node temp = head;
        while (!(temp == null)) {
            if (temp.getData().equals(data)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public MyLinkedList clone() {
        Node cloneCursor = head;
        MyLinkedList clone = new MyLinkedList(cloneCursor.getData());
        for (int i = 1; i < numNodes; i++) {
            cloneCursor = cloneCursor.next;
            clone.addLast(cloneCursor.getData());
        }
        return clone;
    }

    public void printList() {
        System.out.println("list (" + numNodes + ")");
        Node temp = head;
        if (temp == null) {
            System.out.println("List empty");
        } else
            for (int i = 0; i < numNodes; i++) {
                System.out.println("element " + i + ": " + temp.data);
                temp = temp.next;
            }
        System.out.println("\n");
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        int i = 0;
        Node temp = head;
        while (i < numNodes - 1) {
            temp = temp.next;
            i++;
        }
        return temp.next;
    }

    public void clear() {
        head = null;
        tail = null;
    }

}
