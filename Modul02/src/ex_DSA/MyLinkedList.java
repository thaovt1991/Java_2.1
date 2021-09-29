package ex_DSA;

public class MyLinkedList<E> {
    private int numNodes;
    private Node head;
    private Node tail;

    public class Node {
        public Object data;
        public Node next;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        @Override
        public String toString() {
            return "" + getData();
        }
    }

    public MyLinkedList() {
        head = null;
    }

    public MyLinkedList(E data) {
        head = new Node(data);
    }
    public boolean isEmpty(){
        if(numNodes == 0) return true ;
        return false;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        if(numNodes <= 1)return head ;
        int i = 1;
        Node temp = head;
        while (i < numNodes - 1) {
            temp = temp.next;
            i++;
        }
        return temp.next;
    }

    public boolean add(E data) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(data);
        tail = temp.next;
        tail.next = null;
        return true;
    }

    public void add(int index, E data) {
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
        numNodes++;
    }

    public void addLast(E data) {
        if (isEmpty()) addFirst(data) ;
        else {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(data);
        tail = temp.next;
        tail.next = null;
        numNodes++;}
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

        Node temp;
        if (numNodes == 1) {
            temp = head;
            head = tail = null;
            numNodes = 0;
        } else {
            Node current = head;
            for (int i = 1; i < numNodes - 1; i++) {
                current = current.next;
            }
            temp = current.next;
            tail = current;
            tail.next = null;
            numNodes--;
        }
        return (E) temp.data;
    }

    public E remove(int index) {
        if (index < 0 || index >= numNodes) return null;
        if (index == 0) return removeFirst();
        if (index == numNodes - 1) return removeLast();
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

    public E getIndex(int index) {
        if (index < 0 || index >= numNodes) return null;
        if (index == 0) return (E) getHead().data;
        if (index == numNodes - 1) return (E) getTail().data;
        else {
            Node previous = head;
            for (int i = 1; i < index; i++) {
                previous = previous.next;
            }
            return (E) previous.next.data;
        }
    }


    public boolean remove(E e) {
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

    public int indexOf(E data) {
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if (temp.getData().equals(data)) {
                return i;
            }
            temp = temp.next;

        }
        return -1;
    }

    public boolean isContain(E data) {
        Node temp = head;
        while (!(temp == null)) {
            if (temp.getData().equals(data)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public MyLinkedList<E> clone() {
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

    public void clear() {
        head = null;
        tail = null;
    }
}



